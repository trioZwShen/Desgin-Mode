import java.util.Iterator;

/**
 * 水果菜单迭代器, 用于迭代水果菜单, 返回的是MenuComponent
 */
public class FruitMenuIterator implements Iterator<MenuComponent> 
{
    private int pos;
    private int len;
    private MenuComponent[] menu;

    public FruitMenuIterator(MenuComponent[] menu, int len) {
        this.menu = menu;
        this.len = len;
        pos = 0;
    }

    @Override
    public MenuComponent next() {
        return menu[pos++];
    }

    @Override
    public boolean hasNext() {
        return pos < len;
    }

    @Override
    public void remove() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }
}
