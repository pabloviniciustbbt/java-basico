import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
            String nome;
            String sobrenome;
            int idade;
            double altura;

            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            altura = scanner.nextDouble();
            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("\nOlá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        } catch (Exception e) {
            System.out.println("Os campos idade e altura precisam ser numéricos, e utilize '.' no lugar da ','");
        }

        
    }
}