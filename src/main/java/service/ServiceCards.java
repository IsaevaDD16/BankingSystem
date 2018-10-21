package service;

import model.Card;
import model.User;


import java.util.ArrayList;

public class ServiceCards {


    public ServiceCards() {
    }

    public static void addCard(User user, Card card){
       user.addCard(card);
       card.addUser(user);

    }

    public static void lockCard(Card card,Boolean isBlocked){
        if(checkCard(card.getUsers(),card)==1){
        card.lockCard(isBlocked);
            System.out.println("locked");
        }
        else
        { System.out.println("no such card");}
    }
    public static int checkCard(ArrayList<User> users,Card card) {

        int f=0;
        for ( User user1:users) {
            if(card.getNumber()!=null){
               if (user1.getCardId(card) == card.getId()) {
                   f=1;
              }
            }
          }

         return f;

    }


    public static void getSumm(User user) {
        System.out.println("balanse: ");
        int ret[] = user.getCardBySumm(user.getCards());
        //System.out.println(ret[0] + ret[1]);
        System.out.println("plus = "+ret[0]+"  mines = " + ret[1]) ;

    }
    public static void sortCardBySumm( User user){

        user.sortCardBySumm(user.getCards());
    }

    public static void searchCardBySumm (User user, int sum) {

        if (user.searchCardBySumm(user.getCards(), sum).isEmpty()) {
            System.out.println("no such card");
        } else
            System.out.println(user.searchCardBySumm(user.getCards(), sum));

    }

}


