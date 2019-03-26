import java.util.Iterator;

/**
 * 抽象组合类
 *  定义了"个体"与"集合"的操作
 *  定义了遍历集合的迭代器
 *  定义了集合特有的方法
 */
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
