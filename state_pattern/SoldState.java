public class SoldState extends State
{
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void spitOut() {
        System.out.println("糖果+1.");
        machine.popGumball();
        machine.setState(machine.getNoCoinState());
    }
}
