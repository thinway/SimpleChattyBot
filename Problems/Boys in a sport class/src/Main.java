import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean ascending = a >= b && b >= c;
        boolean descending = a <= b & b <= c;

        System.out.println(ascending || descending);
    }
}