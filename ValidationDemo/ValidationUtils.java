import java.lang.reflect.Field;

public class ValidationUtils {
    public static void validateNotEmpty(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value == null || value.toString().trim().isEmpty()) {
                    System.out.println("Warning: Field '" + field.getName() + "' must not be empty!");
                }
            }
        }
    }
    
    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer();
        validateNotEmpty(customer);
    }
}

