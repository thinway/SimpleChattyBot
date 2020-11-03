import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < nums; i++) {
            int n = sc.nextInt();
            if (n % 6 == 0) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}