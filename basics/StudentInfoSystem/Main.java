
class Student{
    private String name;
    private int age;
    private double gpa;
    private String branch;
    private int rollno;
    private boolean isScholarshipHolder;

    public Student(String name, int age, double gpa, String branch, int rollno, boolean isScholarshipHolder){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.branch = branch;
        this.rollno = rollno;
        this.isScholarshipHolder = isScholarshipHolder;
    }
    public void displayInfo(){
        System.out.println(name + ", " + age + ", " + gpa + ", " + branch + ", " + rollno);
        if (isScholarshipHolder == true){
            System.out.println("Scholarship Awarded");
        }
        else{
            System.out.println("No Scholarship");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Student st = new Student("Souhard", 19, 9.2, "Computer Science", 12, true);
        st.displayInfo();
    }
}
