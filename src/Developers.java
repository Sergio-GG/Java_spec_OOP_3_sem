public class Developers extends Employee{

    static int amount = 5000;
    public Developers(String name, int age,int salary) {
        super(name, age, salary);

    }
    public static int addSalary(){
        return amount;
    }
    public void setSalary(int salary) {

        this.salary = salary;
    }
}
