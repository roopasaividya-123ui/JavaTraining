package Objects.oops;
public class first {
    public static void main(String[] args)
    {
        class animal{
            void sound(){
                System.out.println("The animal is making sound ");
            }
        }
        class dog extends animal{
            @Override 
            void sound(){
                System.out.println("Dog is barking");
            }
        }
        animal a = new animal();
         a.sound(); 
         dog d = new dog(); 
         d.sound();
    }
    
}
