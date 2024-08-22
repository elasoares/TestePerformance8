import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    @Test
    public void retornarAreaTest(){
        double numero1 = 5 , numero2 = 10;

        double esperado = 50.0;

        Retangulo retangulo = new Retangulo(numero1, numero2);

        Assertions.assertEquals(esperado, retangulo.retornarArea());

    }

    @Test
    public void retornarPerimetroTest(){
        double numero1 = 5 , numero2 = 10;
        double esperado = 30.0;
        Retangulo retangulo = new Retangulo(numero1, numero2);
        Assertions.assertEquals(esperado, retangulo.retornarPerimetro());
    }
}
