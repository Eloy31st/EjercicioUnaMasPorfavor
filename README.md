# EjercicioUnaMasPorfavor

Mi repositorio: https://github.com/Eloy31st/EjercicioUnaMasPorfavor.git

# Ejercicios repaso
# 1. Dado el siguiente fragmento de código C:
static final double N = 2;
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) {
return med;
} else if (f(min)*f(med)<0) {
return bisect (min,med);
} else {
return bisect (med,max);
}
}

a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

La llamada a la funcion recursiva bisect(0,N) calcula la raiz de la función f(x) dividiendo repetidamente el intervalo[min,max] por la mitad y comprobando si esta cambia de signo en med o en alguno de los subintervalos y se vuelve a ejecutar el metodo con un intervalo más pequeño. A esto se le llama método de bisección.
Si cambiaramos N, estariamos calculando la raiz cuadrada del nuevo número porque el método bisección busca la raiz de la N de la función f(x) en el intervalo[min,max], entonces, si N fuera 4 este método calcularía la raiz de 4.
Si cambiásemos la función f(x), el método bisección calcularía la raíz de esta nueva función pero para ello habría que asegurarse de que cumpliese ciertos requesitos para que devuelva el resultado correcto como ser continua y que tenga cambios de signo en el intervalo que se introduzca.

b) Implemente un algoritmo iterativo equivalente.

# 2. Dado el siguiente algoritmo recursivo:
void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) {
System.out.println(div);
f(num/div,div);
} else {
f(num,div+1);
}
}
}

a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

La función recursiva f(x,2) imprime todos los factores primos de x. Esto surge de que la función comprueba que x sea mayor que 1, si es así, esta comprueba si x % 2 = 0. Si esto es correcto, se imprime 2 ya que es su primer factor primo y se llama a la función nuevamente pero x siendo x/2 y el divisor sigue siendo 2 para comprobar si tiene algun otro factor primo igual a 2. Si x % 2 no es igual a 0, se llama a la función nuevamente para calcular los demás factores primos de x ya que ya se ha comprobado que 2 ya no es un factor primo de esa x.
Un nombre más adecuado sería calculoFactoresPrimos o simplemente factoresPrimos porque así se daría más información a quién utilice el método de que hace exactamente debido a que el nombre "f" es muy genérico y no explica el funcionamiento de la función.

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.

## 3. Construya una función que convierta un número decimal en una cadena que represente el valor del número en hexadecimal (base 16). A continuación, generalice la función para convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante expresiones lambda. ##
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
Por ejemplo:
65029|10 = FE05|16
# 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo, “DABALEARROZALAZORRAELABAD” es un palíndromo. # 

# 5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda, una función que nos devuelva el máximo común divisor de dos números enteros utilizando el algoritmo de Euclides. #
# ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
