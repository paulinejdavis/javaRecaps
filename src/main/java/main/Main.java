package main;

import gym.GymAccount;

public class Main {

    public static void main(String[]args){
        GymAccount account = new GymAccount();
        account.MemberNumber = 43211;
        account.accountName = "Hilary Banks";
        account.balance = 230.0;
        System.out.println("The member number is: "+ account.MemberNumber);
        System.out.println("The member name is: "+ account.accountName);
        System.out.println("The member balance" +
                " is: "+ account.balance);

    }

}


