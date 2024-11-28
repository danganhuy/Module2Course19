public class Exercise2 {
    // [Thực hành] Validate account
    private static String[] validAccount = {"123abc_","_def256","9382866","wldics"};
    private static String[] invalidAccount = {"@xwxsdce","wer","^^","123des#"};

    public static void main(String[] args) {
        for (String account : validAccount) {
            Boolean valid = AccountValidator.validate(account);
            System.out.println(account + " is " + (valid ? "valid" : "invalid"));
        }
        for (String account : invalidAccount) {
            Boolean valid = AccountValidator.validate(account);
            System.out.println(account + " is " + (valid ? "valid" : "invalid"));
        }
    }
}
