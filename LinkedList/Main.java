import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList<String> students=new LinkedList<>();

        students.add("Rahul");
        students.add("Anu");
        students.add("Roopa");

        System.out.println(students);

        students.addFirst("Sai");
        students.addLast("vidya");

        System.out.println(students);

        System.out.println("First: "+students.getFirst());
        System.out.println("Last: "+students.getLast());

        students.removeFirst();
        students.removeLast();
        System.out.println(students);


    }


    
}
