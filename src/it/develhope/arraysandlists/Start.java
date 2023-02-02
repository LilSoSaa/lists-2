package it.develhope.arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Start{
    
    public static void main(String[] args) {


               Integer  s1 [] = new  Integer[]  {1, 2, 4, 13, 26, 52};
        List<Integer>  divisorsOf52 =  Arrays.asList(s1);
        System.out.println("This is the random list: " + divisorsOf52);

               List<Integer>  randomNumbers = new ArrayList<>();
               randomNumbers.add(1);
               randomNumbers.add(60);
               randomNumbers.add(13);
               randomNumbers.add(12);
        System.out.println("This is the random list: " + randomNumbers);

        //  appending all the elements  divisorsOf52 at the bottom of randomNumbers
             randomNumbers.addAll(divisorsOf52);
        System.out.println("This is the update of the randomNumbers' list: " + randomNumbers);
        System.out.println("The list has " + randomNumbers.size() + " items.");


        randomNumbers = randomNumbers.stream().distinct().collect(Collectors.toList());

        System.out.println("The list of randomNumbers without the duplicates: " + randomNumbers);
        System.out.println("The list now has " + randomNumbers.size() + " items.");
        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println("The list in descending order: " + randomNumbers);













    }
}


        // use the .addAll() method to append all the List at the bottom
        

        // find the positions of the duplicates and remove the first occurrence
        

        // use Collections.reverseOrder() as a comparator for the Collections.sort() method
        