package programs;

public class DuplicateString {

    public static void main(String[] args) {
        String myText = "Nico An";
        String modifiedText = removeDuplicates(myText);
        System.out.println(modifiedText);
    }

    public static String removeDuplicates(String inputText) {
        String text = inputText.toLowerCase();

        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c + " c");
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

    return sb.toString();
    }


}