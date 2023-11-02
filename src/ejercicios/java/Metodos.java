
package ejercicios.java;


public class Metodos {

    // Método sin parámetros y sin valor de retorno
    public void saludar() {
        System.out.println("¡Hola, mundo!");
    }

    // Método con parámetros y sin valor de retorno
    public void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    // Método con parámetros y valor de retorno
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método estático (método de clase)
    public static int sumaEstatica(int a, int b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        // Crear una instancia de la clase
        Metodos ejemplos = new Metodos();

        // Llamar a los métodos
        ejemplos.saludar();
        ejemplos.sumar(5, 7);
        int resultadoMultiplicacion = ejemplos.multiplicar(3, 4);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        int resultadoSumaEstatica = sumaEstatica(10, 20);
        System.out.println("El resultado de la suma estática es: " + resultadoSumaEstatica);
    }
    
}
