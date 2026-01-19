
package com.chatapp.ui;

import java.util.Scanner;

public class ConsoleUI {
    public String askUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        return scanner.nextLine();
    }
}
