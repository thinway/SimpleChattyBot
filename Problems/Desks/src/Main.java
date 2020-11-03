import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsClass1 = scanner.nextInt();
        int studentsClass2 = scanner.nextInt();
        int studentsClass3 = scanner.nextInt();
        int totalDesks = 0;

        totalDesks += studentsClass1 % 2 == 0 ? studentsClass1 / 2 : studentsClass1 / 2 + 1;
        totalDesks += studentsClass2 % 2 == 0 ? studentsClass2 / 2 : studentsClass2 / 2 + 1;
        totalDesks += studentsClass3 % 2 == 0 ? studentsClass3 / 2 : studentsClass3 / 2 + 1;

        System.out.println(totalDesks);
    }
}