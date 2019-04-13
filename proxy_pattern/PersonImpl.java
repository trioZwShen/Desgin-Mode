public class PersonImpl implements Person
{
    private String name;
    private int age;
    private double hotOrNotRate;

    public PersonImpl(String name, int age, double hotOrNotRate) {
        this.name = name;
        this.age = age;
        this.hotOrNotRate = hotOrNotRate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHotOrNotRate() {
        return hotOrNotRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setHotOrNotRate(double hotOrNotRate) {
        this.hotOrNotRate = hotOrNotRate;
    }
}
