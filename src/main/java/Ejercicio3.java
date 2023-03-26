import java.util.function.IntFunction;

public class Ejercicio3 {
    private static final char[] DIGITOS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9','A', 'B', 'C', 'D', 'E', 'F'};
    public static String DecimalaHexadecimal(int x, int base){
        IntFunction<String> convertir = num -> {
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(DIGITOS[num % base]);
                num /= base;
            } while (num > 0);
            return sb.reverse().toString();
        };
        return convertir.apply(x);
    }

    public static void main(String[] args) {
        System.out.println(DecimalaHexadecimal(60, 16));
        System.out.println(DecimalaHexadecimal(60, 8));
    }
}
