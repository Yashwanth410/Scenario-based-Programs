import java.lang.reflect.Method;

public class RoleCheckReflection {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "ADMIN";  // Simulate the current user's role
        UserService userService = new UserService();

        Class<?> clazz = userService.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (roleAllowed != null) {
                if (roleAllowed.role().equals(currentUserRole)) {
                    System.out.print("Access granted to method " + method.getName() + ": ");
                    method.invoke(userService);
                } else {
                    System.out.println("Access denied to method " + method.getName() + " for role " + currentUserRole);
                }
            }
        }
    }
}

