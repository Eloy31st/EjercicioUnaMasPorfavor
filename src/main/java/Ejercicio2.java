import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Ejercicio2 {

    public static void funcion(int x, int div){
        if(x > 1){
            if(x % div == 0){
                System.out.println(div);
                x /= div;
                funcion(x, div);
            }else{
                funcion(x, div + 1);
            }
        }
    }

    public static void factoresPrimosIterativo(int x){
        int div = 2;
        do{
            if(x % div == 0){
                System.out.println(div);
                x /= div;
            }else{
                div++;
            }
        }while(x > 1);
    }

    public static void factoresPrimosLambda(int x){
        IntConsumer print = div -> System.out.println(div);
        IntBinaryOperator dividir = (num, div) -> num / div;
        IntUnaryOperator funcion = num -> {
            int div = 2;
            do{
                if(num % div == 0){
                    print.accept(div);
                    num = dividir.applyAsInt(num, div);
                }else{
                    div++;
                }
            }while(num > 1);
            return num;
        };
        funcion.applyAsInt(x);
    }

    public static void main(String[] args) {
        factoresPrimosIterativo(60);
        factoresPrimosLambda(60);
    }
}
