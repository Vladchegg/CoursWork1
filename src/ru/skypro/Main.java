package ru.skypro;

import courswork1.Employee;

public class Main {

    public static void allEmployees (Employee[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int sumSalary (Employee[] b) {
        int sum = 0;
        for (Employee element : b) {
            sum += element.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты = " + sum);

        return sum;
    }

    public static int minSalary (Employee[] c) {
        int min = c[0].getSalary();
        for (int i = 0; i < c.length; i++) {
            if (c[i].getSalary() < min) {
                min = c[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата = " + min);

        return min;
    }

    public static int maxSalary(Employee[] d) {
        int max = d[0].getSalary();
        for (int i = 0; i < d.length; i++) {
            if (d[i].getSalary() > max) {
                max = d[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + max);

        return max;
    }

    public static double averageSalary (Employee[] e) {
        int sum = 0;
        double average = 0;
        for (Employee element : e) {
            sum += element.getSalary();
            average = sum / e.length;
        }
        System.out.println("Среднее значение зарплат = " + average);

        return average;
    }

    public static void fullName (Employee[] f) {
        String fullName1 = f[0].getFullName();
        for (int i = 0; i < f.length; i++) {
            fullName1 = f[i].getFullName();
            System.out.println("Ф.И.О. сотрудника - " + fullName1);
        }
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Морозова Ксения Петровна", 1, 50_000);
        employees[1] = new Employee("Петрова Мария Евгеньевна", 2, 55_000);
        employees[2] = new Employee("Соколов Артем Генадьевич", 3, 60_000);
        employees[3] = new Employee("Давыдов Алексей Николаевич", 4, 65_000);
        employees[4] = new Employee("Дубкова Наталья Леонидовна", 5, 70_000);
        employees[5] = new Employee("Сидоров Юрий Викторович", 1, 75_000);
        employees[6] = new Employee("Пескова Марина Владимировна", 2, 80_000);
        employees[7] = new Employee("Козлов Никита Валерьевич", 3, 85_000);
        employees[8] = new Employee("Лебедев Федор Алексеевич", 4, 90_000);
        employees[9] = new Employee("Орлов Павел Вячеславович", 5, 95_000);

        allEmployees(employees);
        sumSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
        fullName(employees);
        }

    }






