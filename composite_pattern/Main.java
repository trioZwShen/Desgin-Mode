public class Main
{
    public static void main(String [] args) {
        FruitMenu fm = new FruitMenu(4);
        fm.addComponent(new MenuItem("哈密瓜", 10));
        fm.addComponent(new MenuItem("苹果", 1));

        fm.print();
    }
}
