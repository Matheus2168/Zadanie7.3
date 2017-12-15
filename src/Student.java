public class Student extends Person{

    private double averageGrade;

    public Student(String firstName, String lastName, int age, double averageGrade) {
        super(firstName, lastName, age);
        this.averageGrade = averageGrade;
    }

    public void showInfo(){
        System.out.print("STUDENT: ");
        super.showInfo();
        System.out.println("srednia: "+averageGrade);
    }
}
