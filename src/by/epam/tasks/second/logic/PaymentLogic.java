package by.epam.tasks.second.logic;

import by.epam.tasks.second.bean.Payment;
import by.epam.tasks.second.bean.Product;

import java.util.ArrayList;

public class PaymentLogic {

    public boolean makePayment(Payment payment){
        if(payment.getBalance() > new ReceiptLogic().getPriceOfProducts(payment.getReceipt())){
            pay(payment);
            return true;
        }else return false;
    }

    public void pay(Payment payment){
        payment.setBalance(payment.getBalance()-new ReceiptLogic().getPriceOfProducts(payment.getReceipt()));
    }

    public double getBalance(Payment payment){
        return payment.getBalance();
    }

    public static class ReceiptLogic {

        public double getPriceOfProducts(ArrayList<Product> productArrayList){
            double totalPrice = 0;
            for(Product product: productArrayList)
                totalPrice += product.getPrice();
            return totalPrice;
        }

        public double getPriceOfProducts(Payment.Receipt receipt){
            return receipt.getPrice();
        }
    }
}
