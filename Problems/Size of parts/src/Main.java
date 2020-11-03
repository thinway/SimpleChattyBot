import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fixedParts = 0; // 1
        int rejectedParts = 0; // -1
        int readyToShipParts = 0; // 0
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            if (data == 1) {
                fixedParts++;
            } else if (data == -1) {
                rejectedParts++;
            } else if (data == 0) {
                readyToShipParts++;
            }
        }

        System.out.println(readyToShipParts + " " + fixedParts + " " + rejectedParts);
    }
}