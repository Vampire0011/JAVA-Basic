import java.util.Scanner;

class Employee {
    int id;
    String name;
    int[] attendance = new int[7];

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter attendance for Day " + (i + 1) + " (0,1): ");
            attendance[i] = sc.nextInt();

            while (attendance[i] != 0 && attendance[i] != 1) {
                System.out.print("Enter only 1 or 0: ");
                attendance[i] = sc.nextInt();
            }
        }
    }

    void display() {
        int present = 0;
        int absent = 0;

        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double percentage = (present / 7.0) * 100;

        System.out.println("\nAttendance Report");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Present Days: " + present);
        System.out.println("Absent Days: " + absent);
        System.out.printf("Attendance Percentage: %.2f%%\n", percentage);

        if (percentage >= 90) {
            System.out.println("Incentive: Eligible");
        } else {
            System.out.println("Incentive: Not Eligible");
        }
    }
}

public class Attendance {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.input();
        e.display();
    }
}