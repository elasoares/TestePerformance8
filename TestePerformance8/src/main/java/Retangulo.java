import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString

public class Retangulo {
    private double base;
    private double altura;


    public  double retornarArea(){
        return base * altura;
    }
    public  double retornarPerimetro(){
        return 2 * (base + altura);
    }

}
