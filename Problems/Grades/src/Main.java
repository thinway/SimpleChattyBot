import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades = sc.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < grades; i++) {
            int grade = sc.nextInt();
            if (grade == 5) {
                a++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 2) {
                d++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}