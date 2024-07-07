import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        program_1();

    }

    public static void program_1() {
        // creating an ArrayList object
        ArrayList<String> fruitList = new ArrayList<>();

        // adding elements to array list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Peach");
        fruitList.add("Grape");
        fruitList.add("Orange");
        // logging the added elements to the console
        System.out.println("Added some fruits to the Arraylist: " + fruitList);

        // sorting the elements using the Collections module
        Collections.sort(fruitList);
        // logging the updated elements
        System.out.println("After sorting the fruitList array: " + fruitList);

        // removing elements from the Arraylist
        fruitList.remove("Apple");
        // log updated elements to the console
        System.out.println("After removing Apple from the Arraylist: " + fruitList);

        // converting to array from arrayList

        String[] fruitArray = fruitList.toArray(new String[0]);
        // logging array elements
        for (int i=0; i<fruitArray.length; ++i) {
            System.out.println(fruitArray[i]);
        }
    }
}
