public class Main
{
    public static void main(String [] args) {
        Person alice = PersonFactory.getOwner(new PersonImpl("Alice", 23, 0.9));
        Person bob = PersonFactory.getNonOwner(new PersonImpl("Bob", 25, 0.8));

        // self
        System.out.println("-------- self --------");
        System.out.println(alice.getName());
        System.out.println(alice.getAge());
        System.out.println(alice.getHotOrNotRate());

        alice.setName("Alicee");
        alice.setAge(21);
        try {
            alice.setHotOrNotRate(1);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(alice.getName());
        System.out.println(alice.getAge());
        System.out.println(alice.getHotOrNotRate());

        // Other
        System.out.println("-------- other --------");
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getHotOrNotRate());

        bob.setHotOrNotRate(1);
        try {
            bob.setName("bbb");
            bob.setAge(30);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getHotOrNotRate());
    }

}
