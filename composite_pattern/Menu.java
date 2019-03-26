import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent
{
    private ArrayList<MenuComponent> menu;
    private String name;

    public Menu(String name) {
        this.name = name;
        menu = new ArrayList<>();
    }

    @Override
    public void addComponent(MenuComponent component) {
        menu.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menu.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menu.get(i);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return menu.iterator();
    }

    @Override
    public void print() {
        System.out.println("Menu: " + name);
        Iterator<MenuComponent> it = createIterator();
        while (it.hasNext()) {
            it.next().print();
        }
    }
}
