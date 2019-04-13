import java.lang.reflect.*;

/**
 * 拥有者的InvocationHandler类
 */
public class OwnerInvocationHandler implements InvocationHandler
{
    private Person person;
    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException
    {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRate")) {
                throw new IllegalAccessException("给自己设置HotOrNotRate");
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
