package by.epam.tasks.second.bean;

import java.util.ArrayList;
import java.util.Objects;

public class Payment {
    private Receipt receipt;
    private double balance;

    public Payment(Receipt receipt, double balance) {
        this.receipt = receipt;
        this.balance = balance;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.balance, balance) == 0 &&
                Objects.equals(receipt, payment.receipt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receipt, balance);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "receipt=" + receipt +
                ", balance=" + balance +
                '}';
    }

    public static class Receipt {
        private ArrayList<Product> products;
        private double price;

        public Receipt(ArrayList<Product> products, double price) {
            this.products = products;
            this.price = price;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
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
            Receipt receipt = (Receipt) o;
            return Double.compare(receipt.price, price) == 0 &&
                    Objects.equals(products, receipt.products);
        }

        @Override
        public int hashCode() {
            return Objects.hash(products, price);
        }

        @Override
        public String toString() {
            return "Receipt{" +
                    "products=" + products +
                    ", price=" + price +
                    '}';
        }
    }
}
