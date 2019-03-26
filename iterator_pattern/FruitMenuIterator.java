import java.util.Iterator;


/**
 * 水果菜单迭代器, 实现java.util.Iterator, 不支持remove操作
 */
public class FruitMenuIterator implements Iterator<MenuItem> 
{
    private int pos;
    private int len;
    private MenuItem[] menu;

    public FruitMenuIterator(MenuItem[] menu, int len) {
        this.menu = menu;
        this.len = len;
        pos = 0;
    }

    @Override
    public MenuItem next() {
        return menu[pos++];
    }

    @Override
    public boolean hasNext() {
        return pos < len;
    }

    public void remove() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }
}
