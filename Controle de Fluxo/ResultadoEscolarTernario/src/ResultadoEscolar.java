public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

		int nota1 = 6;
		String resultado1 = nota1 >=7 ? "Aprovado" : nota1 >=5 && nota1 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado1);
	}
}