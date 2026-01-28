

public class NinjaDeTaijutsu extends Personagem implements Ninja {

    public NinjaDeTaijutsu(String nome, int idade, String aldeia, String[] jutsus, int chakra) {
        super(nome, idade, aldeia, jutsus, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println("Aplicando o um um golpe de Taijutsu ");
    }

    @Override
    public void desaviar() {
        System.out.println("desviou  do ataqur usando o Taijutsu");
    }
}
