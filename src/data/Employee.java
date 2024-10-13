package data;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {


    protected String surname;
    protected String name;
    protected String middleName;
    protected String position;
    protected String phoneNumber;
    protected int salary;
    protected LocalDate birthDate;


    public Employee(String surname, String name, String middleName, String position, String phoneNumber,
                  int salary, LocalDate birthDate) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }



    @Override
    public String toString() {
        return "Employee " +
                "surname=" + surname +
                ", name=" + name +
                ", middleName=" + middleName +
                ", position=" + position +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", birthDate=" + birthDate;
    }


    @Override
    public int compareTo(Employee o) {
        return this.birthDate.compareTo(o.getBirthDate());
    }

}
