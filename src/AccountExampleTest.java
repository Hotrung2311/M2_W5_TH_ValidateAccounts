public class AccountExampleTest {

    private static AccountExample accountExample;
    public static final String[] accounts = new String[]{"123abc_", "_a!bc123", "______", "123456", "abcdefgh", ".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : accounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("This account " + account + " is " + isValid);
        }
    }
}
