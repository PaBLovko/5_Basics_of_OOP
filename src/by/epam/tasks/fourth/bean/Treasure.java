package by.epam.tasks.fourth.bean;

import java.util.Objects;

public class Treasure {
    private String name;
    private double price;

    public Treasure(String nameTreasure, double price) {
        this.name = nameTreasure;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return Double.compare(treasure.price, price) == 0 &&
                Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

