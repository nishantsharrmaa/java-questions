
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("enter the first string:");
        s1 = sc.nextLine();
        System.out.println("enter the second string:");
        s2 = sc.nextLine();
        if (s1.length() == s2.length()) {
            int i;
            for (i = 0; i < s1.length(); i++) {
                char currchar = s1.charAt(i);
                int flag = 0;
                for (int j = 0; j < s2.length(); j++) {
                    if (currchar == s2.charAt(j)) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("Given strings are not anagram.");
                    break;
                }

            }
            if (i == s1.length()) {
                System.out.println("Given strings are anagram.");
            }
        } else {
            System.out.println("Given strings are not anagram.");
        }
    }
}
