package org.socket;  // Define el paquete al que pertenece la clase

// Declaración de la clase Estudiante
public class Estudiante {
    // Propiedades privadas de la clase
    private int id;           // Identificador único para el estudiante
    private String nombre;    // Nombre del estudiante
    private String apellido;  // Apellido del estudiante
    private int edad;         // Edad del estudiante
    private String curso;     // Curso en el que está inscrito el estudiante

    // Constructor vacío de la clase
    public Estudiante() {
    }

    // Constructor con todos los campos para inicializar un objeto Estudiante
    public Estudiante(int id, String nombre, String apellido, int edad, String curso) {
        this.id = id;               // Inicializa el id
        this.nombre = nombre;       // Inicializa el nombre
        this.apellido = apellido;   // Inicializa el apellido
        this.edad = edad;           // Inicializa la edad
        this.curso = curso;         // Inicializa el curso
    }

    // Getters y Setters para cada propiedad
    public int getId() {
        return id;  // Devuelve el id del estudiante
    }

    public void setId(int id) {
        this.id = id;  // Establece el id del estudiante
    }

    public String getNombre() {
        return nombre;  // Devuelve el nombre del estudiante
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;  // Establece el nombre del estudiante
    }

    public String getApellido() {
        return apellido;  // Devuelve el apellido del estudiante
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;  // Establece el apellido del estudiante
    }

    public int getEdad() {
        return edad;  // Devuelve la edad del estudiante
    }

    public void setEdad(int edad) {
        this.edad = edad;  // Establece la edad del estudiante
    }

    public String getCurso() {
        return curso;  // Devuelve el curso del estudiante
    }

    public void setCurso(String curso) {
        this.curso = curso;  // Establece el curso del estudiante
    }

    // Método toString para representar el objeto Estudiante en forma de texto
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
