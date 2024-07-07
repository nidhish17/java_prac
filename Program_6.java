// Implement a java program to illustrate the use of different types of StringBuffer methods

public class Program_6 {

    public static void main(String[] args) {

        StringBuffer my_string = new StringBuffer("Hello");

        // appending
        my_string.append(" world");
        System.out.println(my_string);

        // replacing
        my_string.replace(0, 3, "hEL");
        System.out.println(my_string);

        // reversing
        my_string.reverse();
        System.out.println(my_string);

        // len
        System.out.println(my_string.length());

        // insert
        my_string.insert(6, ", ");
        System.out.println(my_string);

    }


}