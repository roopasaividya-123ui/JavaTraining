
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        System.out.println("Enter your marks");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

        if(marks>90){
            System.out.println("* * * * *");
        }
        else if(marks>80){
            System.out.println("* * * *");
        }
        else if(marks>70){
            System.out.println("* * * ");
        }
        else if(marks>50){
            System.out.println("* *");
        }
        else {
            System.out.println("* ");
        }

    }
}
