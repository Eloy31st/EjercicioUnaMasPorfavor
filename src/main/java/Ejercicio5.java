public class Ejercicio5 {
    public static int mcdRecursivo(int a, int b){
        if(b == 0){
            return a;
        }else{
            return mcdRecursivo(b, a % b);
        }
    }
    public static int mcdIterativo(int a, int b){
        do{
            int aux = a % b;
            a = b;
            b = aux;
        }while(b != 0);
        return a;
    }

    public static int mcdLambda(int a, int b){
        MCD mcd = new MCD() {
            @Override
            public int mcd(int a, int b) {
                return b == 0 ? a : mcd(b, a % b);
            }
        };
        return mcd.mcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Recursivo: " + mcdRecursivo(60, 24));
        System.out.println("Iterativo: " + mcdIterativo(60, 24));
        System.out.println("Lambda: " + mcdLambda(60, 24));
    }
}
