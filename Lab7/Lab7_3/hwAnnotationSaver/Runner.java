package hwAnnotationSaver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer();
        Class<?> cls = textContainer.getClass();
        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                try {
                    method.invoke(textContainer, saveTo.path());
                    System.out.println("Записано в файл");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
