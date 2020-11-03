import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean check1 = cups >= 10 && cups <= 20 && !isWeekend;
        boolean check2 = cups >= 15 && cups <= 25 && isWeekend;

        System.out.println(check1 || check2);
    }
}