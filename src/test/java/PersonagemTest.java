import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonagemTest {

    @Test
    public void deveVaidarSeJutsuFoiAtribuidoCrretamente() {
        String[] meuJutsus = {"Rasengan", "Chidori"};

        Personagem naruto = new Personagem("Naruto", 18, "Folha", meuJutsus, 100);

        String[] resultado = naruto.getJutsus();

        assertArrayEquals(meuJutsus, resultado);
        assertEquals(2, resultado.length);

    }

    @Test
    public void deveVerificarNomeDaAldeiaFoiAtribuidoCrretamente() {
        Personagem sasuke = new Personagem("Sasuke", 17, "Folha", new String[]{"Chidori"}, 100);
        assertEquals("Folha", sasuke.getNome());
    }


    @Test
    public void deveRetornarErroNomeEstiverNuloOuVazio() {

        assertThrows(RuntimeException.class, () -> {
            new Personagem("", 14, "Falco", new String[]{"Chidori"}, 90);
        }, "Deveria lançar RuntimeException quando o nome for vazio");
    }

    @Test
    public void deveLancarErroQuandoNomeForNull() {

        assertThrows(RuntimeException.class, () -> {
            new Personagem(null, 14, "Falco", new String[]{"Chidori"}, 90);
        }, "Nome não pode ser Null");
    }

    @Test
    public void deveVerificarNomeAldeia() {

        Personagem sakato = new Personagem("MKakashi", 17, "Folha", new String[]{"Sharingan "}, 78);

        assertEquals("Folha", sakato.getAldeia());
        assertEquals(17, sakato.getIdade());


    }

    @Test
    public void deveLancarRuntimeExceptionIdadeMenorQueZero() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> ValidadorPersonagem.ValidarIdadePerspnagem(-12, "idade")
        );
        assertAll(
                () -> assertTrue(ex.getMessage().contains("idade")),
                () -> assertTrue(ex.getMessage().contains("menor que 0")),
                () -> assertTrue(ex.getMessage().contains("maior ou igual a 125"))
        );


    }

    @Test
    public void deveLancarParaIdadeMaior125() {
        assertThrows(IllegalArgumentException.class, () ->
                ValidadorPersonagem.ValidarIdadePerspnagem(125, "idade"));
        assertThrows(IllegalArgumentException.class, () ->
                ValidadorPersonagem.ValidarIdadePerspnagem(200, "idade"));
    }
    @Test
    public void deveLancarErroNomeForNuloOuVazio(){
        assertThrows(RuntimeException.class, () -> {
            Personagem sukato = new Personagem("Luck", 17, "", new String[]{"Sharingan"}, 200);
        }, "Deveria lançar RuntimeException quando o nome aldeia estiver nula ou vazio");


    }
}


