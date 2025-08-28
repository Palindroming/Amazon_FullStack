package Inheritance1;


//부모 클래스
abstract class Payment{
    String user;

    public Payment(String user){
        this.user = user;
    }

    //공통 메서드
    public void printUser(){
        System.out.println("Who pays is : "+ user);
    }
    //추상 메서드
    public abstract void pay(double amount);
}

//인터페이스
interface Refundable{
    void refund(double amount);
}

//자식 클래스 1: 신용카드 결제
class CreditCardPayment extends Payment implements Refundable{
    public CreditCardPayment(String user){
        super(user);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment is : "+ amount);
    }

    @Override
    public void refund(double amount){
        System.out.println("Credit card payment refund is : "+ amount);
    }
}


class CashPayment extends Payment{
public CashPayment(String user){
    super(user);
}

@Override
    public void pay(double amount) {
    System.out.println("Cash payment is : "+ amount);
}
}


class MobilePayment extends Payment implements Refundable{
    public MobilePayment(String user){
        super(user);
    }
    @Override
    public void refund(double amount) {
        System.out.println("Mobile payment is : "+ amount);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Mobile payment refund is : "+ amount);
    }
}
public class PaymentExample {


    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("user1");
        Payment p2 = new CashPayment("user2");
        Payment p3 = new MobilePayment("user3");

        p1.printUser();
        p1.pay(100000);


        Refundable r1 = new CreditCardPayment("user1");
        r1.refund(100000);

    }
}
