public class Main2 {

    public static void main(String[] args) {
        int maxNum = max(2, 6);
        System.out.println(maxNum);
    }


    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}