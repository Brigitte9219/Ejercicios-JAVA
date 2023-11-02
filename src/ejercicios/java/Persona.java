
package ejercicios.java;

// Definición de una clase llamada "Persona"
public class Persona {

    // Atributos de la clase
    String nombre;
    int edad;

    // Método constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método para cumplir años
    public void cumplirAños() {
        edad++;
    }
    
    
    public static void main(String[] args) {
    // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 30);

        // Acceder a los atributos y métodos del objeto
        persona1.mostrarInformacion(); // Muestra información
        persona1.cumplirAños(); // Incrementa la edad en 1
        persona1.mostrarInformacion(); // Muestra información actualizada    
    
    }
    
}
