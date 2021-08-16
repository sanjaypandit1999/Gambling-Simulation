package com.bridglabz;

public class GamblingProb {
    public static final int STAKE = 100;   // gambler's stating stack
    public static final int BET = 1;// gambler's bets
    public static final int itsWin = 1;
    public static final float proLoss = 0.5f;
    public static int winningAmmount, loosingAmmout, stack,winCount,loseCount,TOTALDAYS =30;
    public static int arr[] = new int[TOTALDAYS];


    public static int winLose() {
        int playCheck = (int) (Math.random() * 10) % 2;
        if (playCheck == itsWin) {
            System.out.println("gambler is win");
            stack++;
        }
        else {
            System.out.println(" Gambler is lose ");
            stack--;
        }
        System.out.println("kf" +stack);
        return stack;
    }

    public static int calStack() {
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

    public static int stakefor30days() {

        int StakeAfterDay20 = 0;
        int profitOrloss;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Day: " + i);
            calStack();
            if (stack == loosingAmmout) {
                System.out.println("Lose for day");
                loseCount++;
            } else if (stack == winningAmmount) {
                System.out.println("Win for day");
                winCount++;
            }
            StakeAfterDay20 += stack;
        }
        profitOrloss = StakeAfterDay20 - STAKE * 20;
        System.out.println("Total WINS in a month: " + winCount + "\n"
                + "Total LOSES in a month: " + loseCount);
        return profitOrloss;
    }
    public static void luckyUnluckyDay() {
        int max = 0;
        int min = 1500;
        int luckiestDay = 0, unluckiestDay = 0;

        for (int arr : arr) {

            if (max < arr) {
                max = arr;
            }
            if (min > arr)
                min = arr;
        }

        for (int i = 0; i < TOTALDAYS; i++) {

            if (arr[i] == max) {
                luckiestDay = i + 1;
                System.out.println("Luckiest day: day:" + luckiestDay);
            }
            if (arr[i] == min) {
                unluckiestDay = i + 1;
                System.out.println("Unluckiest day: day:" + unluckiestDay);
            }
        }
        System.out.println("Profit on luckiest day: " + luckiestDay + "\n"
                + "Loss on unluckiest day: " + unluckiestDay);
    }
        public static void main(String[] args) {
        System.out.println("wlecome to gambling game");
        GamblingProb sc = new GamblingProb();
        sc.winLose();
        System.out.println("Gambler reached to " + sc.calStack() + " and stopped for day");
        System.out.println("Profit or loss fo 30 days : " +stakefor30days());
        luckyUnluckyDay();
    }
}
