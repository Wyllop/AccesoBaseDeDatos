package org.socket;

import java.sql.Connection;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicializa un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Establece una conexión con la base de datos
        Connection connection = ConexionDB.getConnection();
        // Crea una instancia de EstudianteDAO para operaciones CRUD
        EstudianteDAO estudianteDAO = new EstudianteDAO(connection);
        int opcion;

        do {
            // Muestra el menú principal
            System.out.println("+-------------------------------------+");
            System.out.println("|                                     |");
            System.out.println("|            MENU PRINCIPAL           |");
            System.out.println("|                                     |");
            System.out.println("+-------------------------------------+");
            System.out.println("| 1. Crear estudiante                 |");
            System.out.println("| 2. Leer estudiantes                 |");
            System.out.println("| 3. Actualizar estudiante            |");
            System.out.println("| 4. Eliminar estudiante              |");
            System.out.println("| 5. Salir                            |");
            System.out.println("+-------------------------------------+");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del scanner

            switch (opcion) {
                case 1:
                    // Lógica para añadir un nuevo estudiante
                    // Solicita al usuario que introduzca los detalles del estudiante y los guarda
                    Estudiante nuevoEstudiante = new Estudiante();
                    System.out.print("Ingrese nombre: ");
                    nuevoEstudiante.setNombre(scanner.nextLine());
                    System.out.print("Ingrese apellido: ");
                    nuevoEstudiante.setApellido(scanner.nextLine());
                    System.out.print("Ingrese edad: ");
                    nuevoEstudiante.setEdad(scanner.nextInt());
                    scanner.nextLine(); // Limpia el buffer del scanner
                    System.out.print("Ingrese curso: ");
                    nuevoEstudiante.setCurso(scanner.nextLine());
                    estudianteDAO.insertarEstudiante(nuevoEstudiante);
                    break;
                case 2:
                    // Lógica para leer y mostrar estudiantes
                    List<Estudiante> estudiantes = estudianteDAO.obtenerEstudiantes();
                    for (Estudiante e : estudiantes) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    // Lógica para actualizar un estudiante
                    System.out.print("Ingrese ID del estudiante a actualizar: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Limpia el buffer del scanner
                    Estudiante estudianteActualizar = new Estudiante();
                    estudianteActualizar.setId(idUpdate);
                    System.out.print("Ingrese nuevo nombre: ");
                    estudianteActualizar.setNombre(scanner.nextLine());
                    System.out.print("Ingrese nuevo apellido: ");
                    estudianteActualizar.setApellido(scanner.nextLine());
                    System.out.print("Ingrese nueva edad: ");
                    estudianteActualizar.setEdad(scanner.nextInt());
                    scanner.nextLine(); // Limpia el buffer del scanner
                    System.out.print("Ingrese nuevo curso: ");
                    estudianteActualizar.setCurso(scanner.nextLine());
                    estudianteDAO.actualizarEstudiante(estudianteActualizar);
                    break;
                case 4:
                    // Lógica para eliminar un estudiante
                    System.out.print("Ingrese ID del estudiante a eliminar: ");
                    int idDelete = scanner.nextInt();
                    estudianteDAO.eliminarEstudiante(idDelete);
                    break;
                // El bucle continúa hasta que el usuario elige salir
                case 5:
                    System.out.println("Saliendo del programa..." +

                            "            _ _           \n" +
                            "          | (_)          \n" +
                            "  __ _  __| |_  ___  ___ \n" +
                            " / _` |/ _` | |/ _ \\/ __|\n" +
                            "| (_| | (_| | | (_) \\__ \\\n" +
                            " \\__,_|\\__,_|_|\\___/|___/\n" +
                            "                         \n" +
                            "                         ");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
        // Cierra el Scanner para evitar fugas de recursos
        scanner.close();
    }
}
