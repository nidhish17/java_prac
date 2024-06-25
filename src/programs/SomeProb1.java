package programs;



public class SomeProb1 {


    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "java";

        System.out.println("str1.compareTo(str2) " + str1.compareTo(str2)); // returns a non zero number
        System.out.println("str1.compareTo(str3) " + str1.compareTo(str3)); // returns a negative number

        System.out.println("str1.compareToIgnoreCase(str2) " + str1.compareToIgnoreCase(str2)); // should be 0
        System.out.println("str1.compareToIgnoreCase(str3) " + str1.compareToIgnoreCase(str3)); // a negative number


    }


}

