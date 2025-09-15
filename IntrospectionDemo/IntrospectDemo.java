public class IntrospectDemo {
    public static void main(String[] args) throws Exception {
        // Dynamically load the Demo class
        Class<?> clazz = Class.forName("Demo");
        
        System.out.println("Declared Fields:");
        for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
            System.out.println("Name: " + field.getName() + ", Type: " + field.getType().getName());
        }
        
        System.out.println("\nDeclared Methods:");
        for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
            System.out.println("Name: " + method.getName() + ", Return Type: " + method.getReturnType().getName());
        }
    }
}

