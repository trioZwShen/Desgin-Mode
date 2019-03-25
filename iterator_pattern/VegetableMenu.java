import java.util.ArrayList;
import java.util.Iterator;

public class VegetableMenu implements Menu
{
    private ArrayList<MenuItem> menu;

    public VegetableMenu(int initLen) {
        menu = new ArrayList<>(initLen);
    }

    @Override
    public void addItem(MenuItem item) {
        menu.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menu.iterator();
    }

    @Override
    public String toString() {
        return "VegetableMenu";
    }
}
