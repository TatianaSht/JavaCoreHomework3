package data;

import java.time.LocalDate;

public class Supervisor extends Employee{

    public Supervisor(String surname, String name, String middleName, String position, String phoneNumber,
                      int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }


    public static void increaseSalary(Employee[] employees, int amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Supervisor)) {
                int currentSalary = employee.getSalary();
                int newSalary = currentSalary + amount;
                employee.setSalary(newSalary);
            }
        }
        System.out.println("The salaries of employees, except for the supervisor, were increased by " + amount + " rub.");
    }


    @Override
    public String toString() {
        return "Supervisor "+
                "surname=" + surname +
                ", name=" + name +
                ", middleName=" + middleName +
                ", position=" + position +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", birthDate=" + birthDate;
    }
}
