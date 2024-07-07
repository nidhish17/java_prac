// Develop a program to read random numbers between a given range that are multiples of 2 and 5, sort
// the numbers according to tens place using comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Program_2 {

    public static void main(String[] args) {

        ArrayList<Integer> random_numbers = generate_rand_nums(100, 1000, 20);
        System.out.println(random_numbers);
        ArrayList<Integer> numbers = sort_using_tens_place(random_numbers);
        System.out.println(numbers);
    }

    public static ArrayList<Integer> generate_rand_nums(int start, int end, int count) {

        int valid_count = 0;
        for (int i=start; i<=end; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                valid_count++;
            }
        }

        if (valid_count < count) {
            throw new IllegalArgumentException("Not enough valid numbers in the specified range");
        }

        // this function generates random numbers between the specified start and end range
        ArrayList<Integer> rand_nums = new ArrayList<Integer>();

        while (rand_nums.size() < count) {
            Random random = new Random();
            int rand_num = random.nextInt(end - start + 1) + start;

            if (rand_num % 2 == 0 && rand_num % 5 == 0) {
                rand_nums.add(rand_num);
            }

        }

        return rand_nums;
    }

    public static ArrayList<Integer> sort_using_tens_place(ArrayList<Integer> numbers) {
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int tens_place_1 = (o1 / 10) % 10;
                int tens_place_2 = (o2 / 10) % 10;
                return Integer.compare(tens_place_1, tens_place_2);
            }
        });
        return numbers;
    }

}




