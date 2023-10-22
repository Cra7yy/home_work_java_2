class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.age != other.age) {
            return Integer.compare(this.age, other.age);
        }
        if (this.salary != other.salary) {
            return Double.compare(other.salary, this.salary);
        }
        return this.department.compareTo(other.department);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + ", department='" + department + "'}";
    }
}
