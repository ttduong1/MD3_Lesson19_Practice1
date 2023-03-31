package rikkei.academy;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"mimi@gmail.com", "kyu@gmail.com", "mimikyu@gmail.com"};
    public static final String[] invalidEmail = new String[] {"1@gmail.com", "#4@gmail.com", "&dga*@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email " + email + " is valid: "+ isvalid);
        }
    }
}
