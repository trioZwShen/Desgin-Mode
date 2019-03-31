public class SoldOutState extends State
{
    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void ejectCoin() {
        System.out.println("退币成功.");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void tunChunk() {
        System.out.println("Oops! 糖果售罄.");
    }
}
