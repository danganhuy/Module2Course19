public class Exercise5 {
    // [Bài tập] Validate số điện thoại
    private static String PHONENUMBER_REGEX = "^\\(\\d{2}\\)\\-\\(0\\d{9}\\)$";
    private static String[] validPhoneNumber = {"(84)-(0978489648)"};
    private static String[] invalidPhoneNumber = {"(a8)-(22222222)", "(84)-(022b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        for (String number : validPhoneNumber) {
            System.out.println(number + " is " + (validatePhoneNumber(number) ? "valid" : "invalid"));
        }
        for (String number : invalidPhoneNumber) {
            System.out.println(number + " is " + (validatePhoneNumber(number) ? "valid" : "invalid"));
        }
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONENUMBER_REGEX);
    }
}
