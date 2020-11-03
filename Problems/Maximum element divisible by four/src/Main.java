import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int maxDivisibleBy4 = 0;

        for (int i = 0; i < nums; i++) {
            int num = sc.nextInt();
            if (num % 4 == 0 && maxDivisibleBy4 < num) {
                maxDivisibleBy4 = num;
            }
        }

        System.out.println(maxDivisibleBy4);
    }
}