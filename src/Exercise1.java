public class Exercise1 {
    // [Thực hành] Validate email

    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        for (String email : validEmail) {
            boolean valid = EmailValidator.validate(email);
            System.out.println(email + " is " + (valid ? "valid" : "invalid"));
        }
        for (String email : invalidEmail) {
            boolean valid = EmailValidator.validate(email);
            System.out.println(email + " is " + (valid ? "valid" : "invalid"));
        }
    }
}
