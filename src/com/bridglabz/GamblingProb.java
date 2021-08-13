package com.bridglabz;

public class GamblingProb {
    public  static final int STAKE = 100;   // gambler's stating stack
    public static final int BET = 1;     // gambler's bets
    public void winLose(){
        int itsWin =1;
        int playCheck = (int)(Math.random()*10)%2;
        if (playCheck == itsWin)
            System.out.println("Gambler is win $1");
        else
            System.out.println("Gambler is loose $1");
    }
    public static void main(String[] args) {
        System.out.println("wlecome to gambling game");
        GamblingProb sc = new GamblingProb();
        sc.winLose();
    }
}
