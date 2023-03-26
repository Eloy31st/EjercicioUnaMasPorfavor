public class Ejercicio4 {
    public static boolean calculoPalindromoIterativo(String palabra){
        boolean palindromo = true;
        int i = 0;
        int j = palabra.length() - 1;
        while(i < j && palindromo){
            if(palabra.charAt(i) != palabra.charAt(j)){
                palindromo = false;
            }
            i++;
            j--;
        }
        return palindromo;
    }

    public static boolean calculoPalindromoRecursivo(String palabra){
        if(palabra.length() <= 1) {
            return true;
        }else if(palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }else{
            return calculoPalindromoRecursivo(palabra.substring(1, palabra.length() - 1));
        }
    }

    public static void main(String[] args) {
        String palabra = "anitalavalatina";
        System.out.println("Iterativo: " + palabra + "es palindromo: "+ calculoPalindromoIterativo(palabra));
        System.out.println("Recursivo: " + palabra + "es palindromo: "+ calculoPalindromoRecursivo(palabra));
    }
}
