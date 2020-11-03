//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String room1;
        String room2;
        String room3;
        String room4;

        room1 = scanner.nextLine();
        room2 = scanner.nextLine();
        room3 = scanner.nextLine();
        room4 = scanner.nextLine();

        printGuests(room4);
        printGuests(room3);
        printGuests(room2);
        printGuests(room1);
    }

    public static void printGuests(String guests) {
        String[] guestList = guests.split(" ");
        for (int i = guestList.length - 1; i >= 0; i--) {
            System.out.println(guestList[i]);
        }
    }
}