package hwAnnotSerializSave;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Serializer {
    public static final String SEMICOLON_DELIMITER = ";";
    public static final String EQUALS_DELIMITER = "=";

    public static String serialize(Object o) throws IllegalAccessException {
        Class cls = o.getClass();
        StringBuilder sb = new StringBuilder();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (!field.isAnnotationPresent(Save.class)) continue;
            if (Modifier.isPrivate(field.getModifiers())) field.setAccessible(true);

            sb.append(field.getName()).append(EQUALS_DELIMITER);

            if (field.getType().equals(int.class))
                sb.append(field.getInt(o));
            else if (field.getType().equals(String.class))
                sb.append(field.get(o));
            else if (field.getType().equals(double.class))
                sb.append(field.getDouble(o));

            sb.append(SEMICOLON_DELIMITER);
        }
        return sb.toString();
    }

    public static <T> T deserialize(String s, Class<T> cls) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        T result = (T) cls.newInstance();
        String[] parse = s.split(SEMICOLON_DELIMITER);
        for (String s1 : parse) {
            String[] token = s1.split(EQUALS_DELIMITER);
            checkToken(token);
            String fieldName = token[0];
            String value = token[1];

            Field field = cls.getDeclaredField(fieldName);

            if (Modifier.isPrivate(field.getModifiers())) field.setAccessible(true);

            if (field.isAnnotationPresent(Save.class)) {
                if (field.getType().equals(int.class))
                    field.set(result, Integer.parseInt(value));
                else if (field.getType().equals(String.class))
                    field.set(result, value);
                else if (field.getType().equals(double.class))
                    field.set(result, Double.parseDouble(value));
            }
        }
        return result;
    }

    private static void checkToken(String[] token) {
        if (!(token.length == 2)) throw new IllegalArgumentException("Wrong string!");
    }
}
