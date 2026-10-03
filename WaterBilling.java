import java.util.Scanner;

public class WaterBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double consumption = sc.nextDouble();
        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        sc.close();
    }
}