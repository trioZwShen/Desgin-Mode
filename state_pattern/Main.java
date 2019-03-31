public class Main
{
    public static void main(String [] args) {
        GumballMachine machine = new GumballMachine(3);
        machine.insertCoin();
        machine.tunChunk();
        machine.insertCoin();
        machine.tunChunk();
        machine.insertCoin();
        machine.tunChunk();
        machine.ejectCoin();
        machine.ejectCoin();
    }
}
