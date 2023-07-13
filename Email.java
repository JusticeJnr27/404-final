import java.util.Scanner;

public class Email {
     String firstName;
     String lastName;
    String password;
    String department;
    String email;
    int mailboxCapacity = 500;
    String alternateEmail;
     String companyAbbreviate = "yearup.com";

    // Constructor to receive the names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //   Call a method for Department
        this.department = setDepartment();

        //  Call a method for password
        this.password = randomPassword(8);
        System.out.println("Password: " + this.password);

        //  Combine the elements to create a work email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyAbbreviate;

    }

    //   Ask for Department
    String setDepartment() {
        System.out.println("New Worker: " + firstName + "\nDepartment Codes\n1 for Sales\n2 for Dev" +
                "\n3 for Accounting\n0 for none\nEnter your Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //  Generate Random password
    String randomPassword(int length) {
        String passwordSet = "ABCEDFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //   Set mail capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //   Set Alternate Email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //   change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() { return  alternateEmail;}
    public String getPassword() { return password;}

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email:  "
                + email +"\nMailbox Capacity: " + mailboxCapacity + " Mails";
    }
}
