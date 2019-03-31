/**
 * Context
 * 对于Client而言, 仅需要暴露如下三种操作
 * 1 投币
 * 2 退币
 * 3 拨动开关
 *
 * 对于糖果机而言, 共有五种状态
 * 1 没有投币
 * 2 已投币
 * 3 销售中
 * 4 胜利者, 此状态与销售中的状态类似, 但是此状态会同时生产两个糖果.
 * 5 已售空
 */
public class GumballMachine
{
    private State state;
    private int count;

    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State winnerState;
    private State soldOutState;

    public GumballMachine(int count) {
        this.count = count;
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        soldOutState = new SoldOutState(this);
        
        state = noCoinState;
    }

    /**
     * 投币
     */
    public void insertCoin() {
        state.insertCoin();
    }

    /**
     * 退币
     */
    public void ejectCoin() {
        state.ejectCoin();
    }

    /**
     * 拨动开关, 因为制作糖果的过程对Client是透明的, 因此封装
     */
    public void tunChunk() {
        state.tunChunk();
        state.spitOut();
    }

    public void popGumball() {
        if (count > 0) {
            count--;
        }
    }

    public void reset(int count) {
        this.count = count;
        state = noCoinState;
    }

    /**
     * setter
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * getter
     */
    public int getCount() {
        return count;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
