import java.util.Iterator;

public class FruitMenu extends MenuComponent
{
    private MenuComponent [] menu;
    private int pos;
    public FruitMenu(int len) {
        menu = new MenuComponent[len];
        pos = 0;
    }

    @Override
    public void addComponent(MenuComponent component) {
        if (pos >= menu.length) {
            throw new RuntimeException("Too many Item");
        }
        menu[pos++] = component;
    }

    @Override
    public void remove(MenuComponent component) {
        for (int i=0; i<pos; ++i) {
            if (menu[i].equals(component)) {
                for (int j = i; j<pos; ++j) {
                    menu[j-1] = menu[j];
                }
                pos--;
                return;
            }
        }
        throw new RuntimeException("There is no target item");
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new FruitMenuIterator(menu, pos);
    }

    @Override
    public void print() {
        System.out.println("Fruit Menu");
        Iterator<MenuComponent> it = createIterator();
        while (it.hasNext()) {
            it.next().print();
        }
    }
}
