import java.util.Date;
import java.util.Scanner;

public class Main {
    private double a;
    private double b;
    private double x;

    public Main(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public void calculateAndPrintResults() {
        double R = (Math.pow(x, 2) * (x + 1)) / b - Math.pow(Math.sin(x + a), 2);
        double S = Math.sqrt((x * b) / a) + Math.pow(Math.cos(x + Math.pow(b, 3)), 2);
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
        calculateAndPrintResults();
        printDateTime();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        Main program = new Main(a, b, x);
        program.run();
    }
}