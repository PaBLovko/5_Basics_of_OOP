package by.epam.tasks.fourth.logic;

import by.epam.tasks.fourth.bean.Treasure;

import java.util.ArrayList;
import java.util.Scanner;

public class TreasureLogic {

    public void showAllTreasure(ArrayList<Treasure> treasures) {
        int id = 1;
        for (Treasure element : treasures)
            System.out.println(String.format("%-3d %-100s", id++, element));
        System.out.println();
    }

    public Treasure chooseMostExpensive(ArrayList<Treasure> treasures){
        double price = treasures.get(0).getPrice();
        Treasure treasureMoreExpensive = treasures.get(0);
        for (Treasure treasure: treasures)
            if(treasure.getPrice() > price) {
                treasureMoreExpensive = treasure;
                price = treasure.getPrice();
            }
        return treasureMoreExpensive;
    }

    public ArrayList<Treasure> selectForGivenAmount(ArrayList<Treasure> treasures, double[] balanceRange){
        ArrayList<Treasure> treasuresForGivenAmount = new ArrayList<>();
        for (Treasure treasure: treasures)
            if (treasure.getPrice() >= balanceRange[0] && treasure.getPrice() <= balanceRange[1])
                treasuresForGivenAmount.add(treasure);
        return treasuresForGivenAmount;
    }

    public ArrayList<Treasure> takeTreasures(int numberOfTreasures, Scanner scanner){
        ArrayList<Treasure> treasures = new ArrayList<>();
        while (scanner.hasNextLine() && numberOfTreasures-- > 0) {
            String[] treasureLine = scanner.nextLine().split(" - ");
            String treasureName = treasureLine[0];
            double treasurePrice = Integer.parseInt(treasureLine[1]);
            treasures.add(new Treasure(treasureName, treasurePrice));
        }
        return treasures;
    }

}
