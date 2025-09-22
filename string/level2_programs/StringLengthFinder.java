import java.util.Scanner;

class StringLengthFinder {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtinLength = text.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);
    }
}
