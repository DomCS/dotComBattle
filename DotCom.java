package com.Dom.Sakrisson;
import java.util.*;




/*get the use guess as a string parameter, convert the user guess to an int repeat with each of the location cells in the int array,
         compare user guess to location cells if the use guess matches increment the number of hits and find out if it was the last location cell
         if number of hits is 3 return kill as the result else it was not a kill so return hit, else the user guess did not match so return "miss"
        */

public class DotCom {

    private ArrayList <String> locationCells;
    private String name;
    //because of arraylist numofhits isn no longer needed
    //int numOfHits;

    public void setLocationCells(ArrayList <String> loc) {

        locationCells=loc;
    }


    public String checkYourself(String userInput) {

        String result="miss";

        int index=locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result="kill";
            } else {
                result="hit";
            }
        }

        return result;

    }
}
        //int guess = Integer.parseInt(stringGuess); //converts the string to an int
        //String result = "miss"; //makes a variable to hold the result well return. put miss in as the default
        //for (int cell : locationCells) { //repeat with each cell in the locationCells array
        //     if (guess == cell) { //compare user guess to the element cell
        //        result = "hit"; //was a hit
        //        numOfHits++; // was a hit
          //      break; // get out of the loop dont need to test more cells for that guess
            //}





    /*setter method that takes an int array with 3 cell locations

    get the cell locations as an int array parameter assign the cell locations parameter to the cell locations instance variable
    */


