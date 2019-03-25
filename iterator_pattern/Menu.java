import java.util.Iterator;

/**
 * 菜单接口, 提供了获取迭代器, 和增加菜单项的方法
 */
public interface Menu
{
    public Iterator<MenuItem> createIterator();

    public void addItem(MenuItem item);
}
