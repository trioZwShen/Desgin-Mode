import java.util.Iterator;

/**
 * 水果菜单
 *  内部采用数组实现, 需要为其创建对应的迭代器, 统一操作
 *  通过将获取迭代器, 将遍历菜单的功能委托给FruitMenuIterator, 保持了单一职责原则
 */
public class FruitMenu implements Menu
{
    private MenuItem [] menu;
    private int pos;

    public FruitMenu(int len) {
        menu = new MenuItem[len];
        pos = 0;
    }
    
    @Override
    public void addItem(MenuItem item) {
        if (pos < menu.length) {
            menu[pos++] = item;
        } else {
            throw new RuntimeException("Too Many Items for FruitMenu");
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new FruitMenuIterator(menu, pos);
    }

    @Override
    public String toString() {
        return "FruitMenu";
    }
}
