import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("========= CAR DETAILS =========");
        System.out.println("NAME: " + car_name);
        System.out.println("COLOR: " + car_color);
        System.out.println("FUEL TYPE: " + car_fuel_type);
        System.out.println("PRICE: ₹" + car_price);
        System.out.println("CAR TYPE: " + car_type);
        System.out.println("TRANSMISSION: " + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE (PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");

        // Validate price input
        while (true) {
            try {
                car_price = Integer.parseInt(sc.nextLine());
                if (car_price < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid car price: ");
            }
        }

        System.out.print("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE (AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();

        total_cars_in_stock++;
    }
}
