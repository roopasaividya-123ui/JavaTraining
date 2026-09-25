package ArrayList;

import java.util.*;

public class Example1 {
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("Roopa");
        students.add("Sai");
        students.add("Vidya");
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

        students.sort(new Comparator<String>() {
            @Override 
            public int compare(String a, String b){
                return b.compareTo(a);
            }  
        });
        Collections.sort(students);
        System.out.println("For sorting in asc"+students);

        students.add(1,"Chinni");
        System.out.println("After adding an element"+students);

        students.set(3,"Harish");
        System.out.println("Using set"+students);

       
        System.out.println("After sorting"+students);
        System.out.println("Total students"+students.size());
        students.clear();
    }
    
}
