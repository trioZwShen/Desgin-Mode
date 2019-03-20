public interface Command
{
    /**
     * 命令的执行
     */
    public void execute();

    /**
     * 命令的撤销, 反操作
     */
    public void undo();
}
