import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        boolean possibleToBreakOff = false;

        if (k % n == 0) {
            int x = k / n;
            if (m > x) {
                possibleToBreakOff = true;
            }
        } else if (k % m == 0) {
            int x = k / m;
            if (n > x) {
                possibleToBreakOff = true;
            }
        }

        System.out.println(possibleToBreakOff ? "YES" : "NO");
    }
}