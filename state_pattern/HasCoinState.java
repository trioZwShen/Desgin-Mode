import java.util.Random;

public class HasCoinState extends State
{
    private GumballMachine machine;
    private Random rand;

    public HasCoinState(GumballMachine machine) {
        this.machine = machine;
        rand = new Random();
    }

    @Override
    public void ejectCoin() {
        System.out.println("退币成功.");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void tunChunk() {
        System.out.println("拨动开关.");
        if (machine.getCount() > 1 && rand.nextInt(3) == 1) {
            machine.setState(machine.getWinnerState());
        } else if (machine.getCount() > 0) {
            machine.setState(machine.getSoldState());
        } else {
            machine.setState(machine.getSoldOutState());
        }
    }
}
