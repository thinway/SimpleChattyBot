import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int prevN = 0;
        int cont = 0;
        int order = -10;
        int newOrder = 0;
        int diff = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            cont++;
            if (n == 0) {
                break;
            }
            if (cont == 1) {
                prevN = n;
            } else {
                if (n != prevN) {
                    diff = n - prevN;
                    if (order == -10) {
                        order = diff != 0 ? diff > 0 ? 1 : -1 : 0;
                    }
                    newOrder = diff != 0 ? diff > 0 ? 1 : -1 : 0;
                    if (order != newOrder && order != -10) {
                        result = false;
                        break;
                    }
                }
                prevN = n;
            }
        }

        System.out.println(result);
    }
}