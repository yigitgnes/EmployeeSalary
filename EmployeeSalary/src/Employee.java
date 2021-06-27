public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void printEmployeeInfo() {
        System.out.println("Vergi: " + taxCalculator(this.salary) + " TL");
        System.out.println("Bonus: " + bonusCalculator(this.workHours) + " TL");
        System.out.println("Maaş Artışı: " + raiseCalculator(this.hireYear, this.salary) + " TL");
        double totalSalary = this.salary+bonusCalculator(this.workHours)+raiseCalculator(this.hireYear, this.salary)- taxCalculator(this.salary);
        System.out.println("Hesaplanan Maaş: " + totalSalary);
    }

    double taxCalculator(int salary) {
        this.salary = salary;

        if (this.salary >= 1000) {
            return (this.salary * 0.03);
        }
        return 0;
    }

    double raiseCalculator(int hireYear, int salary) {
        this.hireYear = hireYear;
        this.salary = salary;
        if ((2021 - this.hireYear) > 19) {
            return this.salary * 0.15;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            return this.salary * 0.10;
        } else if ((2021 - this.hireYear) > 4 && (2021 - this.hireYear) < 10) {
            return  this.salary * 0.05;
        }
        return 0;
    }

    double bonusCalculator(int workHours) {
        this.workHours = workHours;
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

}
