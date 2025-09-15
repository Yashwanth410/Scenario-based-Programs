public class VersionReader {
    public static void main(String[] args) {
        Class<ReportGenerator> clazz = ReportGenerator.class;
        Version version = clazz.getAnnotation(Version.class);
        if (version != null) {
            System.out.println("Class version: " + version.number());
        } else {
            System.out.println("Version info not available.");
        }
    }
}

