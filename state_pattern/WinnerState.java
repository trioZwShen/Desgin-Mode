public class WinnerState extends State
{
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void spitOut() {
        System.out.println("Oh~ 糖果+2.");
        machine.popGumball();
        machine.popGumball();
        machine.setState(machine.getNoCoinState());
    }
}
