package Examples;

class Student {
    String name;
    int age;
    String moode;
    int energy;
    float attendance;

    Student(String name, int age, String moode, int energy, float attendance) {
        this.name = name;
        this.age = age;
        this.moode = moode;
        this.energy = energy;
        this.attendance = attendance;
    }

    public void skipclasses() {
        if (energy < 4) {
            System.out.println("Skip the class");
        }
    }

    public void taketest() {
        if (attendance > 85.0) {
            System.out.println("I am taking test");
        }
    }

    public void sleep() {
        if (moode.equals("bored")) {
            System.out.println("I am feeling sleepy");
        }
    }

    public void study() {
        if (moode.equals("ambitious")) {
            System.out.println("I will study");
        }
    }

    public void eat() {
        if (energy > 5) {
            System.out.println("I will eat");
        }
    }
}

class SuperStudent extends Student {
    String superpower;
    String hobbies;

    SuperStudent(String name, int age, String moode, int energy,
                 float attendance, String superpower, String hobbies) {

        super(name, age, moode, energy, attendance);

        this.superpower = superpower;
        this.hobbies = hobbies;
    }

    public void codeallnight() {
        if (superpower.equals("high") && hobbies.equals("study books")) {
            System.out.println("He can study all night");
        }
    }

    public void debugfor5hours() {
        if (superpower.equals("medium") && hobbies.equals("playing")) {
            System.out.println("He can debug for 5 hours");
        }
    }
}

public class Abc{
    public static void main(String[] args) {

        SuperStudent s2 = new SuperStudent(
            "Roopa",
            20,
            "happy",
            10,
            89.0f,
            "high",
            "study books"
        );

        s2.codeallnight();
        s2.debugfor5hours();

        s2.skipclasses();
        s2.taketest();
        s2.sleep();
        s2.study();
        s2.eat();
    }
}

