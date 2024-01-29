import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();

        Employee emp1 = new Developers("Marcus", 25, 35000);
        Employee emp2 = new Developers("Emily", 23, 41000);
        Employee emp3 = new Developers("Johnathan", 30, 39000);
        Employee emp4 = new Developers("Valentine", 27, 31000);
        Employee emp5 = new Developers("Ruby", 21, 45000);
        Employee emp6 = new Supervisor("Ben", 50, 80000);


        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);

        empList.sort(new NameComparator());
        System.out.println("Сортировка сотрудников по имени: " + empList);
        System.out.println("=========================================================================");

        empList.sort(new AgeComparator());
        System.out.println("Сортировка сотрудников по возрасту: " + empList);
        System.out.println("=========================================================================");

        empList.sort(new SalaryComparator().reversed());
        System.out.println("Сортировка сотрудников по убыванию зарплаты: " + empList);
        System.out.println("=========================================================================");

        for (Employee e: empList) {
            if (e instanceof Supervisor){
                e.setSalary(e.getSalary() + Supervisor.addSalary());
            }else{
                e.setSalary(e.getSalary() + Employee.addSalary());
            }
        }


        System.out.println("Зарпалата с премиальными: " + empList);
    }
}