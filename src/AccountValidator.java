public class AccountValidator {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public static boolean validate(String account) {
        return account.matches(ACCOUNT_REGEX);
    }
}
