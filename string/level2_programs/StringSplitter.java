import java.util.Scanner;
import java.util.ArrayList;

class StringSplitter {
    public static String[] splitUsingCharAt(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
        }
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = splitUsingCharAt(text);
        String[] builtinWords = text.split(" ");

        System.out.println("Custom split:");
        for (String w : customWords) System.out.print(w + " | ");
        System.out.println("\nBuilt-in split:");
        for (String w : builtinWords) System.out.print(w + " | ");

        System.out.println("\nAre both equal? " + compareArrays(customWords, builtinWords));
    }
}
