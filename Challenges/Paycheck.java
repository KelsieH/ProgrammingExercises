import java.util.Random;

public class Paycheck
{
    Random rand = new Random();
    String name;
    String position;
    double wage;
    int idrand = rand.nextInt();

    public Paycheck(String name, String position, int wage)
    {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }

    

}