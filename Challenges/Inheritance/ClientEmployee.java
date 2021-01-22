import java.util.Scanner;

public class ClientEmployee {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String last, first, depart;
        double pay_rate;
        int hours;

        System.out.println("Enter first name: ");
        first = input.nextLine();
        
        System.out.println("Enter last name: ");
        last = input.nextLine();

        System.out.println("Enter the department: ");
        depart = input.nextLine();

        System.out.println("Enter pay rate: ");
        pay_rate = input.nextDouble();

        System.out.println("Enter hours: ");
        hours = input.nextInt();

        Employee userEmp = new Employee(first, last, depart, pay_rate, hours);
        Employee yee = new Employee("Bob", "Guy", "uh", 17.20, 30.0);

        Employee newEmp = new Employee();

        userEmp.printFirstLast();
        yee.print();

        System.out.println();
        newEmp.printFirstLast();
        newEmp.print();

        System.out.println();

        userEmp.printFirstLast();
        userEmp.print();

        System.out.println(yee.equals(newEmp));
        System.out.println(yee.equals(userEmp));

        Employee blankEmp = new Employee();
        blankEmp.copy(userEmp);
        System.out.println(blankEmp.equals(userEmp));

    }
}