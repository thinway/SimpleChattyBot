import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int tens;

        num = scanner.nextInt();
        tens = (num / 10) % 10;

        System.out.println(tens);
    }
}