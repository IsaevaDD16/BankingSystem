package service;

import model.Card;
import model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static junit.framework.TestCase.assertEquals;


public class MainClassTest {
    private User user2;
    private Card card2;
    private Card card3;
    private Card card;
    private Card card1;
    private User user1;
    private Card card5;

    @Before
    public void setUp() throws Exception {
        card = new Card(0, "aaaaa", 500);
        card1 = new Card(1, "bbbbb", 500);
        card2 = new Card(2, "cccc1c1", 1000);
        card3 = new Card(3, "ddddd7dh", -700);
        card5 = new Card(5, "575758hhd", 300);
        user1 = new User(1, "admin", "111");
        user2 = new User(2, "Mike", "1");
        ServiceCards.addCard(user1, card);
        ServiceCards.addCard(user1, card1);
        ServiceCards.addCard(user2, card2);
        ServiceCards.addCard(user2, card3);
    }

    @Test
    public void searchCardBySumm() throws Exception {


        ArrayList<Card> expected = user2.searchCardBySumm(user2.getCards(), 1000);
        ArrayList<Card> card = new ArrayList<>();
        card.add(card2);
        assertEquals(expected, card);
    }

    @Test

    public void getSumm() throws Exception {
        int expected[] = user2.getCardBySumm(user2.getCards());
        int actual[] = {1000, -700};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void checkCard() throws Exception {
        int expected = ServiceCards.checkCard(card.getUsers(), card);
        int expected2 = ServiceCards.checkCard(card5.getUsers(), card5);
        assertEquals(expected, 1);
        assertEquals(expected2, 0);
    }
}