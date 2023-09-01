import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your account number, please: ");
        int account = scanner.nextInt();
        
        System.out.println("Enter your agency number, please: ");
        String agency = scanner.next();
        
        System.out.println("Enter your firstName, please: ");
        String firstName = scanner.next();
        
        System.out.println("Enter your balance, please: ");
        double balance = scanner.nextDouble();
        
        System.out.println("Olá " +  firstName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo de " + balance + " já está disponível para saque.");
    }
}
