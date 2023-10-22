import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 50000, "HR"));
        employees.add(new Employee("Alice", 28, 55000, "Sales"));
        employees.add(new Employee("Bob", 35, 60000, "IT"));
        employees.add(new Employee("Eve", 24, 45000, "Marketing"));
        employees.add(new Employee("Charlie", 32, 52000, "Sales"));
        employees.add(new Employee("Grace", 29, 51000, "HR"));
        employees.add(new Employee("David", 27, 48000, "IT"));
        employees.add(new Employee("Frank", 33, 58000, "IT"));
        employees.add(new Employee("Helen", 31, 59000, "Marketing"));
        employees.add(new Employee("Isabel", 26, 47000, "Sales"));
        employees.add(new Employee("Kevin", 34, 56000, "HR"));
        employees.add(new Employee("Linda", 30, 51000, "IT"));
        employees.add(new Employee("Michael", 29, 52000, "Sales"));
        employees.add(new Employee("Nancy", 25, 49000, "Marketing"));
        employees.add(new Employee("Oliver", 31, 57000, "HR"));
        employees.add(new Employee("Paula", 28, 54000, "IT"));
        employees.add(new Employee("Quincy", 27, 53000, "Marketing"));
        employees.add(new Employee("Robert", 32, 55000, "IT"));
        employees.add(new Employee("Sarah", 33, 56000, "Sales"));
        employees.add(new Employee("Tom", 34, 58000, "HR"));

        Collections.sort(employees);

        System.out.println("Сортировка по умолчанию:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new AgeComparator());

        System.out.println("\nСортировка по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new SalaryComparator());

        System.out.println("\nСортировка по зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new DepartmentComparator());

        System.out.println("\nСортировка по департаменту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
