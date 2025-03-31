import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число k: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть символ: ");
        char symbol = scanner.nextLine().charAt(0);
        System.out.print("Введіть рядок тексту: ");
        String text = scanner.nextLine();
        StringProcessor processor = new StringProcessor(text, k, symbol);
        String result = processor.processString();
        System.out.println("Результат: " + result);
    }
}
