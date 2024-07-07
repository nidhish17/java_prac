// Implement a java program to illustrate the use of different types of character extraction, string
// comparison, string search and string modification methods


public class Program_5 {

    public static void main(String[] args) {

        // extracting chars
        String my_string = "Hello, world";
        char first_char = my_string.charAt(0);
        char last_char = my_string.charAt(my_string.length() - 1);

        // comparing
        String str_1 = "hello";
        String str_2 = "HElLo";

        System.out.println(str_1.compareTo(str_2)); // false
        System.out.println(str_1.compareToIgnoreCase(str_2)); // true

        // string search
        String str_3 = "i like PytHon More than JavA";
        System.out.println(str_3.toLowerCase().contains("python")); //true
        System.out.println(str_3.contains("java")); //false

        // indexOf
        System.out.println(str_3.indexOf("python"));// returns -1
        System.out.println(str_3.toLowerCase().indexOf("python"));// returns start index of python in the sentence


    }

}