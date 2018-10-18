package model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.SortedSet;
//import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    private int id;
    private String username;
    private String password;
   // private Set<Role> roles;
    private ArrayList<Card> cards ;


    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card){
        //ArrayList<Card> userCards= new ArrayList<>();
        cards.add(card);

    }
    public int[] getCardBySumm(ArrayList<Card> card){


        int pSumma =0 ;
        int oSumma =0 ;

        int k=0;
        for (Card card1:card) {
            if (card1.getSum() >= 0) {
                 pSumma += card1.getSum();k=1;
            } else oSumma += card1.getSum();
        }  return new int[] {pSumma, oSumma};
       // System.out.println("plus = "+pSumma+"  mines = " + oSumma) ;
    }

    public  void sortCardBySumm(ArrayList<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {

                return o1.getSum()>o2.getSum()  ? -1:(o1.getSum()<o2.getSum())?1:0;
            }
        });
    }
    public  void searchCardBySumm(ArrayList<Card> card,int summa){
        ArrayList<Card> scard = new ArrayList<>();
        for (Card card1:card)
        {
            if (card1.getSum()==summa){
               scard.add(card1);
            }

        }if(scard.isEmpty()){
            System.out.println("no such card");
        }else
        System.out.println(scard);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cards=" + cards +
                '}';
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getCardId(Card card) {
        return card.getId();
    }

    //@ManyToMany
    //@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

   /* public Set<Role> getRoles() {
        return roles;
        }

    public void setRoles(Set<Role> roles)
    {
        this.roles = roles;
    }*/
}


