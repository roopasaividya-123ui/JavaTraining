class addition{
    void add(int a,int b){
        System.out.println("The sum of two numbers is:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("The sum of three numbers is:"+(a+b+c));
    }
}
public class polymorphism {
    public static void main(String[] args){
        addition obj=new addition();
        obj.add(10,20);
    }
}