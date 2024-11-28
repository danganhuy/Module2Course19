public class Exercise4 {
    private static String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";
    private static String[] validName = {"C0223G", "A0323K"};
    private static String[] invalidName = {"M0318G", "P0323A", "C00K"};

    // [Bài tập] Validate tên của lớp học
    public static void main(String[] args) {
        for (String name : validName) {
            System.out.println(name + " is " + (validateClassName(name) ? "valid" : "invalid"));
        }
        for (String name : invalidName) {
            System.out.println(name + " is " + (validateClassName(name) ? "valid" : "invalid"));
        }
    }

    public static boolean validateClassName(String className) {
        return className.matches(CLASSNAME_REGEX);
    }
}
