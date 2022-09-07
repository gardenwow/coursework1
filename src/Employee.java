public class Employee {
    private String name;
    private String surname;
    private String lastname;
    private int id;
    private static int counter = 1;

    private double salary;
    private int department;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Employee(String name, String surname, String lastname, double salary, int department) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.salary = salary;
        this.department = department;
        id = counter++;

    }

    @Override
    public String toString() {
        return "FIO: " + name + " " + surname + " " + lastname +
                ", ZP: " + salary +
                ", otdel: " + department + ", ego id: " + id;
    }

    public static int getCounter() {
        return counter;
    }
}
