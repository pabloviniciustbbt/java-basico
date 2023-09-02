// Uma exceção customizada que representa um erro de CPF inválido
public class CpfInvalidoException extends Exception {

    // Construtor que recebe a mensagem de erro
    public CpfInvalidoException(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai
    }
}