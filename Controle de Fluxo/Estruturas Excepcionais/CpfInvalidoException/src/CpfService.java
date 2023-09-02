// A classe CpfService representa a lógica de negócio da aplicação
public class CpfService {
    // Um método que formata um CPF e lança uma exceção customizada se ele for inválido
    public static String formatarCpf(String cpf) throws CpfInvalidoException {
        if (cpf.length() != 11) { // Se o CPF não tiver 11 dígitos
            throw new CpfInvalidoException("O CPF deve ter 11 dígitos"); // Lança a exceção customizada
        }
        // Insere os pontos e o traço no CPF
        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
        return cpfFormatado; // Retorna o CPF formatado
    }
}
