import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int dec = number % 10;
        int cent = (number / 10) % 10;
        int mill = (number / 100) % 10;
        int tenMill = number / 1000;

        if (dec == tenMill && cent == mill) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}