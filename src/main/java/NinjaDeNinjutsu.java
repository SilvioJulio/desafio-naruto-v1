
public class NinjaDeNinjutsu extends Personagem implements Ninja{

    public NinjaDeNinjutsu(String nome, int idade, String aldeia, String[] jutsus, int chakra) {
        super(nome, idade, aldeia, jutsus, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println("Aplicando com golpe jutsu de Ninjutsu ");
    }

    @Override
    public void desaviar() {
        System.out.println("desvou do ataqur usando habilidade do Ninjutsu");
    }
}
