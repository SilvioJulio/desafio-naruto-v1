public class Personagem {

    private String nome;
    private int idade;
    private String aldeia;
    private String[] jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, String[] jutsus, int chakra) {
        this.nome = ValidadorPersonagem.ValidadorNomePersonagem(nome,"nome");
        this.idade  = ValidadorPersonagem.ValidarIdadePerspnagem(idade, "idade");
        this.aldeia = aldeia;
        this.jutsus = jutsus;
        this.chakra = chakra;


    }

    public String setNome(String nome) {
        return this.nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int setIdade(int idade) {
        return this.idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String setAldeia(String aldeia) {
        return this.aldeia;
    }

    public String getAldeia() {
        return this.aldeia;
    }

    public String[] setJutsus(String[] jutsus) {
        return this.jutsus;
    }

    public String[] getJutsus() {
        return this.jutsus;
    }

    public int setChakra(int chakra) {
        return this.chakra;
    }

    public int getChakra() {
        return this.chakra;
    }
}
