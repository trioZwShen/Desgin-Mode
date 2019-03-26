public class Main
{
    public static void main(String [] args) {
        Menu fm = new FruitMenu(5);
        fm.addItem(new MenuItem("苹果", 3));
        fm.addItem(new MenuItem("香蕉", 3));
        fm.addItem(new MenuItem("哈密瓜", 3));

        Menu vm = new VegetableMenu(2);
        vm.addItem(new MenuItem("青菜", 1));
        vm.addItem(new MenuItem("香菜", 0.5));
        vm.addItem(new MenuItem("韭菜", 1.5));

        Waitress w = new Waitress();
        w.addMenu(fm);
        w.addMenu(vm);

        w.printAllMenu();
    }
}
