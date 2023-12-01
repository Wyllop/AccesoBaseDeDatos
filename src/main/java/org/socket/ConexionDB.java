package org.socket;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    // Constantes para la URL de conexión, el usuario y la contraseña de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/db_estudiantes";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            // Intenta establecer una conexión con la base de datos usando las credenciales proporcionadas
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            // Captura cualquier excepción, la imprime en la consola y devuelve null 
            e.printStackTrace();
            return null;
        }
    }
}
