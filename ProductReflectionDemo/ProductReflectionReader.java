public class ProductReflectionReader {
    public static void main(String[] args) throws Exception {
        // Load the Product class dynamically
        Class<?> clazz = Class.forName("Product");
        // Create a new instance of Product
        Object obj = clazz.getDeclaredConstructor().newInstance();
        // Get the showDetails() method
        java.lang.reflect.Method method = clazz.getMethod("showDetails");
        // Invoke showDetails() on the Product instance dynamically
        method.invoke(obj);
    }
}

