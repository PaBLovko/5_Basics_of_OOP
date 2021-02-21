package by.epam.tasks.fourth.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Cave {
    private String name;
    private int numberOfTreasure;
    private ArrayList<Treasure> treasures;

    public Cave(String name, ArrayList<Treasure> treasures) {
        this.name = name;
        this.treasures = treasures;
        this.numberOfTreasure = treasures.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTreasure() {
        return numberOfTreasure;
    }

    public void setNumberOfTreasure(int numberOfTreasure) {
        this.numberOfTreasure = numberOfTreasure;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return numberOfTreasure == cave.numberOfTreasure &&
                Objects.equals(name, cave.name) &&
                Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfTreasure, treasures);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "name='" + name + '\'' +
                ", numberOfTreasure=" + numberOfTreasure +
                ", treasures.txt=" + treasures +
                '}';
    }
}
