import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels;
        int nuts;

        squirrels = scanner.nextInt();
        nuts = scanner.nextInt();

        System.out.println(nuts / squirrels);
    }
}