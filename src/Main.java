public class Main {
    public static void main(String[] args) {
        Employee alesha = new Employee("Алексей", "Валерьевич", "Пантюхин", 55000, 4);
        Employee valera = new Employee("Валерий", "Александрович", "Мошкин", 67000, 1);
        Employee sasha = new Employee("Александр", "Александрович", "Сечин", 48000, 3);
        Employee marina = new Employee("Марина", "Анатольевна", "Берк", 33000, 2);
        Employee[] employee = new Employee[10];
        employee[0] = alesha;
        employee[1] = valera;
        employee[2] = sasha;
        employee[3] = marina;
        System.out.println("зарплата всех: " + salaryEmployee(employee));
        Employee marina1 = new Employee("Марина", "Анатольевна", "Берк", 37000, 2);
        employee[4] = marina1;
        printEq();
        System.out.println("зарплата всех: " + salaryEmployee(employee));
        printEq();
        listOfEmployee(employee);
        System.out.println();
        printEq();
        minOrMaxSalary(employee);
        printEq();
        System.out.println("averageSalary(employee) = " + averageSalary(employee));
        printEq();
    }

    public static double salaryEmployee(Employee[] employee) {
        double salary = 0;
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] != null) {
                salary += employee[j].getSalary();
            }
        }
        return salary;
    }

    public static void listOfEmployee(Employee[] employee) {
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] != null) {
                System.out.print(employee[j].getName() + " " + employee[j].getSurname() + " " + employee[j].getLastname());
                System.out.print("; ");
            }
        }
    }

    public static void printEq() {
        System.out.println("==============");
    }

    public static void minOrMaxSalary(Employee[] employee) {
        double minSalary = employee[0].getSalary();
        double maxSalary = employee[0].getSalary();
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] != null) {
                if (minSalary > employee[j].getSalary()) {
                    minSalary = employee[j].getSalary();
                } else if (maxSalary < employee[j].getSalary()) {
                    maxSalary = employee[j].getSalary();
                }
            }
        }
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] != null) {
                if (minSalary == employee[j].getSalary()) {
                    System.out.println("Сотрудник с минимальной зп: " + employee[j].getName() + " " + employee[j].getSurname() + " " + employee[j].getLastname());
                } else if (maxSalary == employee[j].getSalary()) {
                    System.out.println("Сотрудник с максимальной зп: " + employee[j].getName() + " " + employee[j].getSurname() + " " + employee[j].getLastname());
                }
            }

        }
    }
    public static double averageSalary(Employee[] employee) {
        double average = salaryEmployee(employee) / (Employee.getCounter() - 1);
        return average;
    }
}