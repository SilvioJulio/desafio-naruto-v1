
public class NinjaDeGenjutsu extends Personagem implements Ninja {
    public NinjaDeGenjutsu(String nome, int idade, String aldeia, String[] jutsus, int chakra) {
        super(nome, idade, aldeia, jutsus, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println("Aplicando o um um golpe jutsu de Genjutsu ");

    }

    @Override
    public void desaviar() {
        System.out.println("desviou do ataqur usando sua habilidade com Genjutsu");

    }
}
