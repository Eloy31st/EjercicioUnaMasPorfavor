public class Ejercicio1 {
    private static final double N = 2;
    private static final double PREC = 1e-6;

    public static double funcion(double x) {
        return (Math.pow(x, 2) - N);
    }

    public static double bisect(double min, double max) {
        double med = (min + max) / 2;
        if (max - min < PREC) {
            return med;
        } else if (funcion(min) * funcion(med) < 0) {
            return bisect(min, med);
        } else {
            return bisect(med, max);
        }
    }

    public static void main(String[] args) {
        double raiz = bisect(0, N);
        System.out.println("La raiz de " + N + " es " + raiz);
    }
}
