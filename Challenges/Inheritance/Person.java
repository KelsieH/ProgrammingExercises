public class Person {
    private String firstName, lastName;

    public Person() {
        this.firstName = "Billy";
        this.lastName = "Bob";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printLastFirst() {
        System.out.println(this.lastName + ", " + this.firstName);
    }

    public String getFirst() {return this.firstName;}
    public String getLast() {return this.lastName;}

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public boolean equals(Object ob) {
        return (ob instanceof Person && (((Person) ob).getFirst().equals(firstName) && ((Person) ob).getLast().equals(lastName)));
    }

    public void copy(Person dude) {
        this.firstName = dude.getFirst();
        this.lastName = dude.getLast();
    }

    public Person getCopy() {
        return new Person(this.firstName, this.lastName);
    }

}