package by.epam.tasks.fourth.logic;

import by.epam.tasks.fourth.bean.Cave;
import by.epam.tasks.fourth.bean.Treasure;

import java.util.ArrayList;
import java.util.Scanner;

public class CaveLogic {

    public ArrayList<Treasure> selectForGivenAmount(Cave cave, double[] balanceRange) {
        return new TreasureLogic().selectForGivenAmount(cave.getTreasures(), balanceRange);
    }

    public ArrayList<Treasure> fillCaveWithTreasures(int countTreasures, Scanner scanner){
        return new TreasureLogic().takeTreasures(countTreasures, scanner);
    }

    public void showAllTreasuresInCave(Cave cave){
        new TreasureLogic().showAllTreasure(cave.getTreasures());
    }

    public void showTreasuresInCave(ArrayList<Treasure> treasures){
        new TreasureLogic().showAllTreasure(treasures);
    }

    public Treasure chooseMostExpensive(Cave cave) {
        return new TreasureLogic().chooseMostExpensive(cave.getTreasures());
    }
}
