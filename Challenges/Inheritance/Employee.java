public class Employee extends Person {
    private double payRate;
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    //default constructor
    public Employee() {
        super();
        this.payRate = 0.0;
        this.hoursWorked = 0.0;
        this.department = "";
    }

    public Employee(String first, String last, String depart, double pay, double hours) {
        super(first, last);
        hoursWorked = hours;
        department = depart;
        payRate = pay;
    }

    public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
    }

    public void print() {
        System.out.println("The employee " + super.getFirst() + super.getLast() + " from the " + department + " department worked " + hoursWorked + " hours with a pay rate of $" + payRate + ". " + this.toString());
    }

    public double calculatePay() {
        if (hoursWorked <= HOURS) {
            return (double) payRate * hoursWorked;
        } 
        return (double) HOURS * payRate + ((double) (hoursWorked - HOURS) * payRate * OVERTIME);

    }

    public void setAll(String first, String last, double rate, double hours, String depart) {
        super.setName(first, last);
        this.payRate = rate;
        this.hoursWorked = hours;
        this.department = depart;
    }

    public double getPayRate() {return payRate;}
    public double getHoursWorked() {return hoursWorked;}
    public String getDepartment() {return department;}

    public Employee getCopy() {
        return new Employee(getFirst(), getLast(), this.payRate, this.hoursWorked, this.department);
    }

    public boolean equals(Object obj) { 
        if (obj instanceof Employee){

           Employee e = (Employee) obj;
           return ((super.equals(obj)) && (e.getPayRate() == this.getPayRate()) && (e.getHoursWorked() == this.getHoursWorked()) && (e.getDepartment() == this.getDepartment()));
        
        }
        return false;
    }

    public void copy(Employee e) {
        super.copy(e);
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
    }

}