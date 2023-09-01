import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        //Criando nossa instância do Scanner para fazer a leitura dos dados inseridos pelo usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //solicitando dado do usuário
        System.out.println("Enter your account number, please: ");
        //atribuindo a variável o dado inserido pelo usuário
        int account = scanner.nextInt();
        
        System.out.println("Enter your agency number, please: ");
        String agency = scanner.next();
        
        System.out.println("Enter your firstName, please: ");
        String firstName = scanner.next();

        System.out.println("Enter your lastName, please: ");
        String lastName = scanner.next();
        
        System.out.println("Enter your balance, please: ");
        double balance = scanner.nextDouble();

        //concatenando nomes usando o método .concat()
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println();
        //concatenando strings e imprimindo a mensagem
        System.out.println("Olá " +  fullName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo de "+  balance + " já está disponível para saque.");
    }
}
