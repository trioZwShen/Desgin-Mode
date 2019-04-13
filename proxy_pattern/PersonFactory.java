import java.lang.reflect.Proxy;

/**
 * 评分系统工厂类
 */
public class PersonFactory
{
    public static Person getOwner(Person p) {
        return (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[] {Person.class}, new OwnerInvocationHandler(p));
    }

    public static Person getNonOwner(Person p) {
        return (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[] {Person.class}, new NonOwnerInvocationHandler(p));
    }
}
