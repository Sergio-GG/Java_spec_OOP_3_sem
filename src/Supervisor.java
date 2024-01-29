public class Supervisor extends Employee{


    static int amount = 0;

    public Supervisor(String name, int age, int salary) {

        super(name, age, salary);
    }

    public static int addSalary(){
        return amount;
    }
    public void setSalary(int salary) {

        this.salary = salary;
    }
}
