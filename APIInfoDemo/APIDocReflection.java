import java.lang.reflect.Method;

public class APIDocReflection {
    public static void main(String[] args) {
        Class<UserAPI> clazz = UserAPI.class;
        System.out.println("Available API Endpoints:");
        for (Method method : clazz.getDeclaredMethods()) {
            APIInfo apiInfo = method.getAnnotation(APIInfo.class);
            if (apiInfo != null) {
                System.out.println(
                    "Endpoint: " + apiInfo.endpoint() +
                    " | Method: " + apiInfo.method() +
                    " | Java Method: " + method.getName()
                );
            }
        }
    }
}

