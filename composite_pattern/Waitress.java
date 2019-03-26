public class Waitress
{
    private MenuComponent allMenu;

    public Waitress() {
        allMenu = new Menu("Welcome to KFC");
    }

    public void addComponent(MenuComponent component) {
        allMenu.addComponent(component);
    }

    public void printAllMenu() {
        allMenu.print();
    }

    public void printMenuByIndex(int i) {
        allMenu.getChild(i).print();
    }

    public static void main(String [] args) {
        Waitress w = new Waitress();
        // 0
        w.addComponent(new MenuItem("招牌菜", 1000));

        // 1 水果类的实现与别的菜单不同
        MenuComponent fruit = new FruitMenu(10);
        fruit.addComponent(new MenuItem("哈密瓜", 1));
        fruit.addComponent(new MenuItem("西瓜", 2));
        w.addComponent(fruit);

        // 2
        Menu vegetable = new Menu("蔬菜类");
        vegetable.addComponent(new MenuItem("西蓝花", 1));
        vegetable.addComponent(new MenuItem("芹菜", 2));
        w.addComponent(vegetable);

        // 3
        Menu fish = new Menu("鱼类");
        fish.addComponent(new MenuItem("黑鱼", 100));
        fish.addComponent(new MenuItem("鲈鱼", 100));
        w.addComponent(fish);


        // 4
        Menu beverage = new Menu("饮品");
        // 4.0
        Menu alcohol = new Menu("酒水");
        // 4.0.0
        alcohol.addComponent(new MenuItem("啤酒", 20));
        // 4.0.1
        alcohol.addComponent(new MenuItem("白酒", 40));
        beverage.addComponent(alcohol);
        // 4.1
        beverage.addComponent(new MenuItem("牛奶", 100));
        // 4.2
        beverage.addComponent(new MenuItem("果汁", 20));
        w.addComponent(beverage);


        System.out.println("-----Print All Menu------");
        w.printAllMenu();
        System.out.println("\n-----Print By Index------");
        w.printMenuByIndex(4);
    }
}
