abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
/*  Animal a=new Animal(); // Error because Animal is abstract */
/*  so we are inheriting the abstract method and then calling it  */
/*this is where abstract method is used where implementation is provided by the subclass  */
public class abstraction {
    public static void main(String[] args){
        Dog an=new Dog();
        an.sound();
    }
}
