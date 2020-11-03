import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cont = 0;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                cont++;
                sum += i;
            }
        }

        double average = (double) sum / cont;
        System.out.println(average);
    }
}