package util;

import java.util.Scanner;

public class InputUtil {

    public static int inputInt(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }

    public static String inputString(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }
}
