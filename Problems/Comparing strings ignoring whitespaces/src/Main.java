import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String line1 = sc.nextLine();
       String line2 = sc.nextLine();

       System.out.println(line1.trim().replace(" ","")
               .equals(line2.trim().replace(" ","")));
    }
}