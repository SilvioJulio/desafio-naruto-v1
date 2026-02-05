public class ValidadorPersonagem {

    public static String ValidadorNomePersonagem(String nome, String campo) {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("O cmapo:" + campo + " é obrigartório e não pode está vazio");
        }
        return nome;
    }

    public static int ValidarIdadePerspnagem(int idade, String campo) {
        if (idade < 0 || idade >= 125) {
            throw new
                    IllegalArgumentException(
                    "O campo \"" + campo + "\" não pode ser menor que 0 nem maior ou igual a 125"
            );
        }

        return idade;
    }
}
