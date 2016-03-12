import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yaroslav on 03.03.16.
 */
public class NeverSleepingEye implements InvocationHandler{

    private Object obj;

    public NeverSleepingEye(Object f1){ obj = f1; }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Never sleeping Eye invoke: " + method.getName());

            if(method.getName().equals("getName")){
                System.out.println("меняем на setName");
                method = obj.getClass().getMethod("setName",String.class);
                return method.invoke(obj,"Петя");
            }
            else {
                return method.invoke(obj, args);
            }
    }
}
