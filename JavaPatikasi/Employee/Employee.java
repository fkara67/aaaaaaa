public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours <= 40) {
            return 0;
        }
        else {
            return (workHours - 40) * 30;
        }
    }
    public double riseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear < 20) {
            return this.salary * 0.10;
        }else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double totalSalary = this.salary + this.bonus() + this.riseSalary();
        return "Name : " + this.name + "\nSalary : " + this.salary + "\nWorkHours : " + this.workHours +
                "\nHire Year : " + this.hireYear + "\nTax : " + this.tax() + "\nBonus : " + this.bonus() +
                "\nSalary Rise : " + this.riseSalary() + "\nTotal Salary : " + totalSalary +
                "\nNet Salary : " + (totalSalary - this.tax());

    }
}