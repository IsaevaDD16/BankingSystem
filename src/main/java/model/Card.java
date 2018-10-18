package model;

import java.util.ArrayList;

public class Card  {
    private int id;
    private String  number;
    private int sum;
    private  boolean lock = false;
    private   ArrayList<User> users;


    public Card() {
    }

    public Card(int id, String number, int sum) {
        this.id = id;
        this.number = number;
        this.sum = sum;

        this.users = new  ArrayList<>()  ;
    }

    public void lockCard(boolean isBlocked)
    {
        this.lock = isBlocked;
    }
    public void addUser(User user){

        users.add(user);}

    public int getId() {
        return id;
    }



    public String getNumber() {
        return number;
    }



    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isLock() {

        return lock;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", sum=" + sum +
                ", lock=" + lock +
                '}';
    }
}

