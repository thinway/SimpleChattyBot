import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        do {
            System.out.println(i * i);
            i++;
        } while (n >= i * i);
    }
}