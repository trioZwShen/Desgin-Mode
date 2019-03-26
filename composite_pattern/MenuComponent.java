import java.util.Iterator;

abstract public class MenuComponent
{
    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }
    public void addComponent(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
