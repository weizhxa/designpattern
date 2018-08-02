package Principle.OCP;

import java.util.Scanner;

/**
 * Open Close principle
 * 开放封闭原则
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        System.out.println(username);
    }
}
