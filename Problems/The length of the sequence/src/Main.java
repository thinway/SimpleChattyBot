import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n != 0) {
                counter++;
            } else {
                break;
            }
        }

        System.out.println(counter);
    }
}