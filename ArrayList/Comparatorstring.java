
import java.util.*;

public class Comparatorstring {
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("Roopa");
        students.add("sai");
        students.add("vidya");
        students.add("Beemisetty");

        System.out.println("Students"+students);

        System.out.println("First student:"+students.get(0));

        students.set(1,"Ammu");

        System.out.println("After update"+students);

        students.remove("Beemisetty");

        System.out.println("After remove"+students);


        if(students.contains("Roopa")){
            System.out.println("Roopa is present");
        }
        System.out.println("Total students"+students.size());
    }
    
}
