import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int value;

        do {
            value = sc.nextInt();
            if (value > max && value != 0) {
                max = value;
            }
        } while (value != 0);

        System.out.println(max);
    }
}