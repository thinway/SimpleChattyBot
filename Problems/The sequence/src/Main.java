import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int max = 0;
        int i = 0;

        while (i < nums) {
            int n = sc.nextInt();
            if (n % 4 == 0 && n > max) {
                max = n;
            }
            i++;
        }

        System.out.println(max);
    }
}