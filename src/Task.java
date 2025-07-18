import java.util.*;

public class Task {
    public void stack() {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the number of elements of Stack: ");
        int size = scanner.nextInt();
        System.out.print("Enter elements: ");
        for (int i=0;i<size;i++) {
            stack.push(scanner.nextInt());
        }
        System.out.println("The stack is : "+stack);
        System.out.print("Enter the element you want to search in Stack: ");
        if (stack.contains(scanner.nextInt())) {
            System.out.println("The element is found in the stack");
        }
        else {
            System.out.println("The element is not found in the stack");
        }
    }

    public void vector() {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();
        System.out.print("Enter the number of elements of Vector: ");
        int size = scanner.nextInt();
        System.out.print("Enter elements: ");
        for (int i=0;i<size;i++) {
            vec.add(scanner.nextInt());
        }
        System.out.println("The vector is : "+vec);
        System.out.print("Enter the element you want to search in Vector: ");
        if (vec.contains(scanner.nextInt())) {
            System.out.println("The element is found in the Vector");
        }
        else {
            System.out.println("The element is not found in the Vector");
        }
    }

    public void searchDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        System.out.print("Enter a single digit (0-9): ");
        char digit = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
            }
        }
        System.out.println("The digit '" + digit + "' appears " + count + " times in the number.");
    }

    public void reverseString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }

    public void generateAnagrams(String str) {
        generateAnagrams("", str);
    }

    private void generateAnagrams(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generateAnagrams(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1)
                );
            }
        }
    }


}

class Main {
    public static void main(String[] args) {
        Task task = new Task();
        String input = "abc";
        System.out.println("Anagrams of \"" + input + "\":");
        task.generateAnagrams(input);
    }
}
