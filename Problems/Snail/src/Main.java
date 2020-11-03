import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((h - b - 1) / (a - b) + 1);
        /*int days = 0;
        int jump = 0;

        do {
            jump += a;
            days++;
            if (jump >= h) {
                break;
            }
            jump -= b;
        } while (jump < h);

        System.out.println(days);*/
    }
}