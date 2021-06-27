import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adı: ");
        String name = scanner.next();

        System.out.print("Maaşı: ");
        int salary = scanner.nextInt();

        System.out.print("Çalışma Saati: ");
        int workHours = scanner.nextInt();

        System.out.print("Başlangıç Yılı: ");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        employee.printEmployeeInfo();
    }
}
