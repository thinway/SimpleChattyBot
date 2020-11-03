import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1;
        int hour2;
        int min1;
        int min2;
        int sec1;
        int sec2;
        int totalSecs;
        int secsFromMidnight1;
        int secsFromMidnight2;

        hour1 = scanner.nextInt();
        min1 = scanner.nextInt();
        sec1 = scanner.nextInt();
        hour2 = scanner.nextInt();
        min2 = scanner.nextInt();
        sec2 = scanner.nextInt();

        secsFromMidnight1 = hour1 * 3600 + min1 * 60 + sec1;
        secsFromMidnight2 = hour2 * 3600 + min2 * 60 + sec2;

        totalSecs = secsFromMidnight2 - secsFromMidnight1;

        System.out.println(totalSecs);
    }
}