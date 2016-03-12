import java.lang.reflect.Proxy;

/**
 * Created by yaroslav on 03.03.16.
 */
public class TestJavaDynamicProxy {
    public static void main(String[] args) {
        Person pers = new Person();

        IPerson personProxy = (IPerson) Proxy.newProxyInstance(Person.class.getClassLoader(),
                                                                Person.class.getInterfaces(),
                                                                new NeverSleepingEye(pers));

        personProxy.setName("Вася");
        String name = personProxy.getName();

        System.out.println(name);

        personProxy.setName("Гриша");
        name = personProxy.getName();

        System.out.println(pers.getName());
    }
}
