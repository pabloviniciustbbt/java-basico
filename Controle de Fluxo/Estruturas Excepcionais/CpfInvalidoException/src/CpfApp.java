// A classe CpfApp representa a interface da aplicação com o usuário

import java.util.Scanner;

public class CpfApp {
    // Um método que usa o método formatarCpf e trata a exceção customizada
    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o seu CPF:(Apenas os números)");
            String cpf = scan.next(); // Um CPF válido
            
            String cpfFormatado = CpfService.formatarCpf(cpf); // Formata o CPF usando o método da classe CpfService
            System.out.println("\nO CPF formatado é " + cpfFormatado + "\n"); // Imprime o CPF formatado

            scan.close();
        } catch (CpfInvalidoException e) { // Captura a exceção customizada
            System.out.println("\nOcorreu um erro: " + e.getMessage()); // Imprime a mensagem de erro
        }
    }
}
