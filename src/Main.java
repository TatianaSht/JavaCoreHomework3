import data.Employee;
import data.Supervisor;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        // Создание сотрудников
        Employee ivan = new Employee("Ovchinnikov", "Ivan", "Igorevich",
                "developer", "8(495)100-22-33", 50000,
                LocalDate.of(1983, 8, 17));
        Employee andrey = new Employee("Bezrukov", "Andrey", "Viktorovich",
                "fitter", "8(495)111-22-33", 52000,
                LocalDate.of(2000, 5, 5));
        Employee evgeniy = new Employee("Delfinov", "Evgeniy", "Viktorovich",
                "project manager", "8(495)222-33-44", 40000,
                LocalDate.of(1975, 10, 19));
        Employee natalia = new Employee("Keks", "Natalia", "Pavlovna",
                "senior developer", "8(495)333-44-55", 90000,
                LocalDate.of(1987, 3, 25));
        Employee tatiana = new Employee("Krasotkina", "Tatiana", "Sergeevna",
                "accountant", "8(495)444-55-66", 50000,
                LocalDate.of(1996, 1, 22));
        Supervisor semen = new Supervisor("Semenov", "Semen", "Semenivich",
                "developer", "8(495)022-11-33", 100000,
                LocalDate.of(1990, 12, 15));

        // Добавление сотрудников в массив отдела
        Employee[] developmentDepartment = {ivan, andrey, evgeniy, natalia, tatiana, semen};

        // Список сотрудников до повышения зарплаты
        System.out.println();
        System.out.println("List of development department employees before salary increase");
        Arrays.stream(developmentDepartment).forEach(System.out::println);

        // Повышение зарплаты всем сотрудникам кроме руководителя
        System.out.println();
        Supervisor.increaseSalary(developmentDepartment, 5000);
        System.out.println();
        System.out.println("List of employees of the post-salary increase development department");
        Arrays.stream(developmentDepartment).forEach(System.out::println);

        // Сортировка сотрудников по дате рождения
        Arrays.sort(developmentDepartment);
        System.out.println();
        System.out.println("List of employees sorted by date of birth");
        Arrays.stream(developmentDepartment).forEach(System.out::println);

    }
}