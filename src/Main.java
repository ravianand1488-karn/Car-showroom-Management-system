import java.util.*;

interface utility {
    void get_details();
    void set_details();
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println("0].EXIT");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Showroom> showrooms = new ArrayList<>();
        List<Employees> employees = new ArrayList<>();
        List<Cars> cars = new ArrayList<>();
        int choice;

        do {
            main_menu();
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number:");
                sc.next(); // Clear invalid input
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Showroom newShowroom = new Showroom();
                    newShowroom.set_details();
                    showrooms.add(newShowroom);
                    break;
                case 2:
                    Employees newEmployee = new Employees();
                    newEmployee.set_details();
                    employees.add(newEmployee);
                    break;
                case 3:
                    Cars newCar = new Cars();
                    newCar.set_details();
                    cars.add(newCar);
                    break;
                case 4:
                    for (Showroom showroom : showrooms) {
                        showroom.get_details();
                        System.out.println();
                    }
                    break;
                case 5:
                    for (Employees employee : employees) {
                        employee.get_details();
                        System.out.println();
                    }
                    break;
                case 6:
                    for (Cars car : cars) {
                        car.get_details();
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
