import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        CalculatorTest testInstance = new CalculatorTest();
        Class<?> clazz = testInstance.getClass();

        System.out.println("Executing test cases...");

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TestCase.class)) {
                System.out.println("Running: " + method.getName());
                method.invoke(testInstance);
            }
        }
    }
}

