public class PayrollTester
{
    public static void main(String[] args)
    {
        Employee one = new Employee("Bob", "Boss", 100, 0, 0);
        Employee two = new Employee("John", "Janitor", 1, 2, 3);

        one.work(2);
        System.out.println(one.getCurrentHours());
        System.out.println(one.request());
        System.out.println(one.getCurrentHours());
        System.out.println(one.getId());
        System.out.println(two.getId());
    }
}