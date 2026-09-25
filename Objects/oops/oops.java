//Abstraction
abstract class Payment{
    abstract void pay();
}

class UPI extends Payment{
    @Override 
    void pay(){
        System.out.println("Payment done using API");
    }
}
class Cash extends Payment{
    @Override 
    void pay(){
        System.out.println("Payment done using Cash");
    }
}
class Card extends Payment{
    @Override 
    void pay(){
        System.out.println("Payment done using card");
    }
}
class Customer{
    private String name;
    private double balance;
    
    Customer(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public void addMoney(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
}

public class oops {
    public static void main(String[] args){
        Customer customer=new Customer("Rahul",15000);
        System.out.println("Customer balance"+customer.getName()+":₹"+customer.getBalance());
        Payment upiPayment=new UPI();
        Payment cardpayment=new Card();

        upiPayment.pay();
        cardpayment.pay();




    }
    
}
