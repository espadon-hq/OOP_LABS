import java.util.Date;
import java.util.Scanner;

public class Main {
    private double a;
    private double b;
    private double x;

    public Main() {}

    public void inputInitialValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        this.a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        this.b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        this.x = scanner.nextDouble();
    }

    public double calculateR() {
        return (Math.pow(x, 2) * (x + 1)) / b - Math.pow(Math.sin(x + a), 2);
    }

    public double calculateS() {
        return Math.sqrt((x * b) / a) + Math.pow(Math.cos(x + Math.pow(b, 3)), 2);
    }

    public void printResults() {
        double R = calculateR();
        double S = calculateS();
        System.out.printf("R = %.4f\n", R);
        System.out.printf("S = %.4f\n", S);
    }

    public void printDateTime() {
        Date currentDate = new Date();
        int year = currentDate.getYear() % 100; // Отримуємо останні дві цифри року
        int month = currentDate.getMonth() + 1; // Місяці в Date починаються з 0
        int day = currentDate.getDate();
        System.out.printf("Дата: %02d-%02d-%02d", year, month, day);
    }

    public void run() {
        inputInitialValues();
        printResults();
        printDateTime();
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }
}
