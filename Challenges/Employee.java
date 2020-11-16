public class Employee
{
    private static int id = 0;
    private String name = "";
    private String position = "";
    private double wage = 0;
    private double paycheck = 0;
    private double currentHours = 0;
    private double totalHours = 0;

    public Employee(String name, String position, int wage, double currentHours, double totalHours) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.currentHours = currentHours;
        this.totalHours = totalHours;
        this.id = id;
        id++;
    }

    public void work(int hours) {
        this.currentHours += hours;
        this.totalHours += hours;
    }

    public Paycheck request() {
        Paycheck paycheck = new Paycheck(this);
        return paycheck;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public double getWage() {
        return wage;
    }
    
    public double getPaycheck() {
        return paycheck;
    }

    public double getCurrentHours() {
        return currentHours;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
}