import java.lang.reflect.Method;

public class AnnotationReflectionReader {
    public static void main(String[] args) {
        Class<SampleAPI> clazz = SampleAPI.class;

        // Access and display the class-level annotation
        APIDescription classAnnotation = clazz.getAnnotation(APIDescription.class);
        if (classAnnotation != null) {
            System.out.println("Class Description: " + classAnnotation.description());
        }

        // Access and display method-level annotations
        for (Method method : clazz.getDeclaredMethods()) {
            APIDescription methodAnnotation = method.getAnnotation(APIDescription.class);
            if (methodAnnotation != null) {
                System.out.println("Method " + method.getName() + ": " + methodAnnotation.description());
            }
        }
    }
}

