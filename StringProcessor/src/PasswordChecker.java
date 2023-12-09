public class PasswordChecker {

    public static boolean isStrongPassword(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialSymbol = password.matches(".*[!@#$%^&*()-_+=].*");

        return hasUppercase && hasLowercase && hasDigit && hasSpecialSymbol;
    }

    public static void main(String[] args) {
        System.out.println(isStrongPassword("Abc@123")); // true
        System.out.println(isStrongPassword("weakpassword")); // false
    }
}

