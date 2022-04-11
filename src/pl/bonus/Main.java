package pl.bonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1.Write a Java program to create a new array list, add some colors (string) and print out the collection

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("blue");
        colours.add("grey");
        colours.add("white");
        colours.add("green");

        System.out.println(colours);
/*
        //2.Write a Java program to iterate through all elements in a array list
        for (String item : colours) {
            System.out.println(item);
        }*/

        /*//3.Write a Java program to insert an element into the array list at the first position
        colours.set(0,"white");
        for (String item : colours) {
            System.out.println(item);
        }*/

        /*//4.Write a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(colours.get(1));
        System.out.println(colours.get(2));*/

         /* //5.Write a Java program to update specific array element by given element
         String newColour = "black";
         colours.set(2, newColour);*/


      /* //6. Write a Java program to remove the third element from a array list
        colours.remove(2);
        System.out.println(colours);*/

        /*//7.Write a Java program to search an element in a array list

        if(colours.contains("red"))
        {
            System.out.println("I found it");
        }
        else System.out.println("I did not find it");*/

        //8.Write a Java program to sort a given array list
/*
        Collections.sort(colours);
        System.out.println(colours);*/

        //9.Write a Java program to copy one array list into another
/*
        List<String> coloursCopy = new ArrayList<>();
        coloursCopy.add(null);
        coloursCopy.add(null);
        coloursCopy.add(null);
        coloursCopy.add(null);
        coloursCopy.add(null);

        Collections.copy(coloursCopy, colours);
        System.out.println(coloursCopy);*/

        //10. Write a Java program to shuffle elements in a array list

        /*Collections.shuffle(colours);
        System.out.println(colours);*/

        //11. Write a Java program to reverse elements in a array list

        /*Collections.reverse(colours);
        System.out.println(colours);*/

        //12. Write a Java program to extract a portion of a array list
        //

        //13. Write a Java program to compare two array lists

       List<String> colours3 = new ArrayList<>();
        colours3.add("Bonus");
        colours3.add("blue");
        colours3.add("blue");
/*
        List<String> c3 = new ArrayList<>();

        for (String item : colours) {

            c3.add(colours3.contains(item) ? "Yes" : "No");
        }*/

        //14. Write a Java program of swap two elements in an array lis

       /* Collections.swap(colours, 0, 3);
        System.out.println(colours);
*/
        //15. Write a Java program to join two array lists

       /* List<String> listaTestowa = new ArrayList<>();

        listaTestowa.addAll(colours);
        listaTestowa.addAll(colours3);
        System.out.println(listaTestowa);*/


        //
        //16. Write a Java program to clone an array list to another array list

      /*  List<String> test = new ArrayList<>();
        test = (ArrayList) ((ArrayList<String>) test).clone();
        System.out.println(test);*/

        //17. Write a Java program to empty an array list
        /*colours.clear();
        System.out.println("Hehe " + colours);*/

        //18. Write a Java program to test an array list is empty or not


/*

        System.out.println("Is empty?");
        System.out.println(colours.isEmpty());

        colours.clear();
        System.out.println("Empty now?" + colours.isEmpty());

*/


// 18. Write a Java program to trim the capacity of an array list the current list size

/*
        colours.trimToSize();
*/







    }
}
