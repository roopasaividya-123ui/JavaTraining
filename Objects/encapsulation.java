class Student{
    private String name;

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
public class encapsulation{
    public static void main(String[] args){

    Student s=new Student();
    s.setname("Roopa sai vidya");
    System.out.println(s.getname());
    }
}