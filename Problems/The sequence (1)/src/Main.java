import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (counter == n) {
                    break;
                }
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}