package prAnnotationTest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Runner {
    public static void main(String[] args) {
        Class<?> ls = TestClass.class;

        Method[] methods = ls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                try {
                    method.invoke(ls, test.a(), test.b());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


