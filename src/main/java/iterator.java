import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Vitalii on 21.07.2016.
 */
public class iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(22);
                add(12);
                add(13462);
                add(176);
                add(-2464);
                add(51);
                add(875);
                add(344);
                add(-975);
            }
        };
        for (Iterator<Integer> value = list.iterator(); value.hasNext(); ) {
            Integer val = value.next();
            if ((val % 2) == 0) {
                value.remove();
            }

        }
        list.forEach(System.out::println);

        Object[] objects = list.toArray();
        System.out.println(objects);
    }

}
