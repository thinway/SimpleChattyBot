import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}