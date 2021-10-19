package Lesson4;

public class PayMoney {
    public static void main (String[] args){
        Payment pay = new Payment();
        pay.setPayment();

        System.out.println("You have to pay " + pay.getPayment() + " euros for");
        pay.print();
    }
}
