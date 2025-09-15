import java.lang.reflect.Method;

public class LogReflection {
    public static void main(String[] args) throws Exception {
        AccountService service = new AccountService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Loggable.class)) {
                Loggable loggable = method.getAnnotation(Loggable.class);
                
                // Print log message before method execution
                System.out.println("LOG: " + loggable.message());
                
                // Invoke actual method
                method.invoke(service);
            }
        }
    }
}

