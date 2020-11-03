import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 1;
        long fact = 1;

        while (fact <= n) {
            i++;
            fact = fact * i;
        }

        System.out.println(i);
    }
}