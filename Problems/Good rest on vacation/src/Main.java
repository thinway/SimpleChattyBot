import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightHotelCost = scanner.nextInt();
        int totalCost = totalFoodCostPerDay * durationDays +
                (durationDays - 1) * oneNightHotelCost +
                oneWayFlightCost * 2;

        System.out.println(totalCost);
    }
}