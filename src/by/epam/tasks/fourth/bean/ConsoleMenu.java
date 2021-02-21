package by.epam.tasks.fourth.bean;

import java.util.Scanner;

public class ConsoleMenu {
    private final Scanner scanner;
    private final String directory;

    public ConsoleMenu(String directory){
        this.directory = directory;
        this.scanner = new Scanner(System.in);
    }

    public String getDirectory() {
        return directory;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
