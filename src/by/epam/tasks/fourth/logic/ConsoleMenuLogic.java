package by.epam.tasks.fourth.logic;

import by.epam.tasks.fourth.bean.Cave;
import by.epam.tasks.fourth.bean.ConsoleMenu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenuLogic {

    public void startConsoleMenu(ConsoleMenu consoleMenu){
        try {
            int choice;
            boolean isStopped = false;

            printOptions();
            while (!isStopped) {
                System.out.println("Please enter the number of the operation. \nYour choice: ");
                choice = makeChoice(consoleMenu.getScanner());
                Cave cave = creatCave(consoleMenu.getDirectory());
                isStopped = processingOperation(choice, consoleMenu.getScanner(), cave);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Invalid directory. Try again.\n");
        }
    }

    public void printOptions() {
        String menuText = "Available operations:\n" +
                "1 - Show all treasures.txt;\n" +
                "2 - Choose the most expensive treasure;\n" +
                "3 - Select treasures.txt for a given amount;\n" +
                "4 - Close application.";
        System.out.println(menuText);
    }

    public int makeChoice(Scanner scanner){
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("There is no such option. Repeat entry.\n");
                printOptions();
            } else return choice;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.\n");
            printOptions();
        }
        return -1;
    }

    public Cave creatCave(String directory) throws FileNotFoundException {
        return new Cave("Pablo", new CaveLogic().fillCaveWithTreasures(
                100, new Scanner(new FileReader(directory))));
    }

    public boolean processingOperation(int choice, Scanner scanner, Cave cave){
        CaveLogic caveLogic = new CaveLogic();
        switch (choice){
            case 1:
                System.out.println("List of treasures in the cave:");
                caveLogic.showAllTreasuresInCave(cave);
                break;
            case 2:
                System.out.println("The most expensive treasure:");
                System.out.println(caveLogic.chooseMostExpensive(cave));
                break;
            case 3:
                double [] valueRange = new double[2];
                boolean isValid = false;
                while (!isValid) {
                    System.out.println("Enter the desired range of treasure value with a space.");
                    try {
                        valueRange[0] = scanner.nextInt();
                        valueRange[1] = scanner.nextInt();
                        isValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Try again.");
                    }
                }
                System.out.println(String.format("Treasures value from %f to %f:", valueRange[0], valueRange[1]));
                caveLogic.showTreasuresInCave(caveLogic.selectForGivenAmount(cave, valueRange));
                break;
            case 4:
                System.out.println("The work is completed.\nGoodbye");
                return true;
        }
        return false;
    }
}
