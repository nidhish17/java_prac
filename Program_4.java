// Implement a java program to illustrate the use of different types of string class constructors


public class Program_4 {

    public static void main(String[] args) {

        String str_1 = "halo";
        System.out.println("str_1: " + str_1);

        char[] char_arr = {'H', 'a', 'l', 'O'};
        String str_2 = new String(char_arr);
        System.out.println("str_2: " + str_2);

        byte[] byte_arr = {12, 45, 76, 90, 111};
        String str_3 = new String(byte_arr);
        System.out.println("str_3: " + str_3);

        StringBuilder string_builder = new StringBuilder("Hello");
        String str_5 = string_builder.toString();
        System.out.println("str_5: " + str_5);

        StringBuffer string_buffer = new StringBuffer("hello");
        String str_6 = new String(string_buffer);
        System.out.println("str_6: " + str_6);

    }

}