package dz;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Vitalii on 21.07.2016.
 */
public class Main {
    public static class My {
        public static <T> T produce(Class<T> clazz) {
            //       clazz.newInstance();
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    return null;
                }
            };
            return null;
        }
    }
}
