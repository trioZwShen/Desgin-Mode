public class NoCoinState extends State
{
    private GumballMachine machine;

    public NoCoinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("投币成功.");
        machine.setState(machine.getHasCoinState());
    }
}
