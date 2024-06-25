package programs;


public class SomeProb2 {

    public static void main(String[] args) {

        String txt_1 = "I Python";
        String txt_2 = "Love";

        String result = modifyStringByCreating(txt_1, txt_2, 2);
        System.out.println(result);
        String result1 = modifyString(txt_1, txt_2, 2);
        System.out.println(result1);

    }

    public static String modifyStringByCreating(String original, String toInsert,int index) {
        // this creates a new string and then returns that newly created string
        return original.substring(0, index) + toInsert + " " + original.substring(index);
    }

    public static String modifyString(String original ,String toInsert, int index) {
        StringBuffer strBuf = new StringBuffer(original);
        return strBuf.insert(index, toInsert + " ").toString();
    }



}




