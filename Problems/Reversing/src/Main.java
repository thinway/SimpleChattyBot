import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        number = scanner.nextInt();

        System.out.println((number % 10) * 100 + ((number / 10) % 10) * 10 + number / 100);
    }
}