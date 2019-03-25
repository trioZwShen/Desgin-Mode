import java.util.ArrayList;
import java.util.Iterator;


/**
 * 女招待类
 *  持有不同的菜单, 通过ArrayList维护, 方便扩展新的菜单
 *  通过迭代器操作, 统一操作不同实现的菜单
 */
public class Waitress
{
    private ArrayList<Menu> menuList;

    public Waitress() {
        menuList = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void printAllMenu() {
        for (Menu menu : menuList) {
            System.out.println(menu);
            printMenuByIterator(menu.createIterator());
        }
    }

    private void printMenuByIterator(Iterator<MenuItem> it) {
        while (it.hasNext()) {
            MenuItem item = it.next();
            System.out.println(item.getName() + " " + item.getPrice());
        }
    } 
}
