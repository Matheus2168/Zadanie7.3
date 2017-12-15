public class Teacher extends Person{

    private int salary;


    public Teacher(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public void showInfo(){
        System.out.print("NAUCZYCIEL: ");
        super.showInfo();
        System.out.println("zarobki: "+salary);
    }
}
