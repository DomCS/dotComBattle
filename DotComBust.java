package com.Dom.Sakrisson;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList <DotCom>();
    int numOfGuesses = 0;

    private void setUpGame() {

        DotCom one=new DotCom();
        //tried to set the name for each dotcom, throws an error when not commented

        //one.setName("Bing.com");

        DotCom two=new DotCom();
        //two.setName("google.com");

        DotCom three=new DotCom();
        //three.setName("bitcoin.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // close for loop
    }

    private void startPlaying() {
        while(!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess between  'A0, G7' " );
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGeuss) {

        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGeuss);
            if (result.equals("hit")){
                break;
            }
            if(result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("All dotcoms are dead, your stock is now worthless.");
        if(numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got ou tbefore tour options sank");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

        /*

        The array and how to generate the random numbers used in it for the the dot com location
        Giving the dotcom a boolean setting its status to Alive
         */

//        int[] locations={randomNum, randomNum + 1, randomNum + 2};
//        theDotCom.setLocationCells(locations);
//        boolean isAlive=true;
//
//        while (isAlive == true) {
//
//            String guess=helper.getUserInput("enter a number");
//            String result=theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("kill")) {
//                isAlive=false;
//                System.out.println("You took " + numOfGuesses + " guess");
//
//            }
//
//        }
}



















