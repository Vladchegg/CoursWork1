package courswork1;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 1;
    private int id;

    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString () {
        return "Ф.И.О. Сотрудника: " + this.fullName + ", Отдел - " + this.department + ", Заработная плата - " + this.salary + ", Порядковый номер " + this.id;
    }


}
