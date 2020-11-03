//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String cuisinePreference;

        firstName = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        cuisinePreference = scanner.nextLine();

        System.out.println("The form for " + firstName +
                " is completed. We will contact you if we need a chef that cooks " + cuisinePreference +
                " dishes.");
    }
}