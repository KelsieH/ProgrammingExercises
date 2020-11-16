public class Paycheck
{
    String employee = "";
    double wage = 0;
    double paycheck = 0;
    boolean erroneous = false;
    int hours = 0;

    public Paycheck(Employee employee)
    {
        this.employee = employee.getName();
        this.wage = employee.getWage();
        this.paycheck = employee.getPaycheck();
        this.employee = employee.getName();
        if (paycheck >= 1500 || hours >= 100) {
            erroneous = true;
        }
    }

	public Paycheck(String string, String string2, double d) {
	}
}