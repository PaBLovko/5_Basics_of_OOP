package by.epam.tasks.second.runner;

/*
    Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров.
 */

import by.epam.tasks.second.bean.Payment;
import by.epam.tasks.second.bean.Product;
import by.epam.tasks.second.logic.PaymentLogic;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Product p1 = new Product("apple", 100253, 0.6);
        Product p2 = new Product("oranges", 120222, 2.99);
        Product p3 = new Product("tomato", 115125, 1.11);
        Product p4 = new Product("mishmash", 115135, 1000.90);
        Product p5 = new Product("orel", 115175, 53.9);
        ArrayList<Product> productArrayList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        PaymentLogic.ReceiptLogic receiptLogic = new PaymentLogic.ReceiptLogic();
        Payment payment = new Payment(new Payment.Receipt(productArrayList,
                receiptLogic.getPriceOfProducts(productArrayList)), 1300);
        PaymentLogic paymentLogic = new PaymentLogic();
        if(paymentLogic.makePayment(payment))
            System.out.println("payment made. You are balance = "+paymentLogic.getBalance(payment));
        else System.out.println("payment is not made. You are balance = "+paymentLogic.getBalance(payment)
                +" price of products = "+receiptLogic.getPriceOfProducts(payment.getReceipt()));
    }
}