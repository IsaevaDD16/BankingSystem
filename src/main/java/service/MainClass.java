package service;

import model.Card;
import model.User;

import java.util.ArrayList;

import static service.ServiceCards.sortCardBySumm;


public class MainClass {

    public static void main(String[] args) throws Exception{

        Card card = new Card(0,"aaaaa",500);
        Card card1 = new Card(1,"bbbbb",500);
        Card card2 = new Card(2,"cccc1c1",1000);
        Card card3 = new Card(3,"ddddd7dh",-700);

        User user1=new User(1,"admin","111");
        User user2=new User(2,"Mike","1");
        ServiceCards.addCard(user1,card);
        ServiceCards.addCard(user1,card1);
        ServiceCards.addCard(user2,card2);
        ServiceCards.addCard(user1,card3);


       // ServiceCards.searchCardBySumm(user2,1000);
       // ServiceCards.sortCardBySumm(user2);
       // System.out.println(user1);
        //Card card4 = new Card();
        //System.out.println(card4);



      //  ServiceCards.getSumm(user1);

       // System.out.println(new Card());
        //System.out.println(card3.getUsers());
    }
}