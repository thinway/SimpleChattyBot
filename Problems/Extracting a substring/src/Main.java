import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(str.substring(num1, num2 + 1));
    }
}