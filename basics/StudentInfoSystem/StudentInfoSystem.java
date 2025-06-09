package StudentInfoSystem;


class Student{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void Prnt(){
        System.out.println(name + ", " + age + ", " + gpa);
    }
}

public class Main{
    public static void main(String[] args) {
        Student st = new Student("Souhard", 19, 9.2);
        st.Prnt();
    }
}
