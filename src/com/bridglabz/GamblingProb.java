package com.bridglabz;

public class GamblingProb {
    public static final int STAKE = 100;   // gambler's stating stack
    public static final int BET = 1;// gambler's bets
    public static final int itsWin = 1;
    public static final float proLoss = 0.5f;
    public int winningAmmount, loosingAmmout, stack;

    public int winLose() {
        int playCheck = (int) (Math.random() * 10) % 2;
        if (playCheck == itsWin) {
            System.out.println("gambler is win");
            stack++;
        }
        else {
            System.out.println(" Gambler is lose ");
            stack--;
        }
        return stack;
    }

    public int calStack() {
        loosingAmmout = (int) Math.round(STAKE  * proLoss);
        winningAmmount = (int) Math.round(STAKE + (STAKE * proLoss));
        boolean stop = true;
        stack = STAKE;
        while (stop == true) {
            winLose();
            if (stack == loosingAmmout) {
                stop = false;
            }
            if (stack == winningAmmount) {
                stop = false;
            }
        }
        return  stack;
    }
        public static void main(String[] args) {
        System.out.println("wlecome to gambling game");
        GamblingProb sc = new GamblingProb();
        sc.winLose();
        System.out.println("Gambler reached to " + sc.calStack() + " and stopped for day");
    }
}
