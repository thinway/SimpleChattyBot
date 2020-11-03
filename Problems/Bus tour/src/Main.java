import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numBridges = sc.nextInt();
        boolean willCrash = false;
        int willCrashBridge = 0;

        for (int i = 1; i <= numBridges; i++) {
            int bridgeHeight = sc.nextInt();
            if (busHeight >= bridgeHeight) {
                willCrash = true;
                willCrashBridge = i;
                break;
            }
        }

        if (!willCrash) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + willCrashBridge);
        }
    }
}