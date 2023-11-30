package org.socket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    private Connection connection;

    public EstudianteDAO(Connection connection) {
        this.connection = connection;
    }

    // Crear (Insertar)
    public boolean insertarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, apellido, edad, curso) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setInt(3, estudiante.getEdad());
            statement.setString(4, estudiante.getCurso());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Estudiante añadido satisfactoriamente." +
                        "░░░░░░░░░░░▄▄\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░█░░░█\n" +
                        "░░░░░░░░█░░░░█\n" +
                        "██████▄▄█░░░░░██████▄\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█████░░░░░░░░░█\n" +
                        "█████▀░░░░▀▀██████▀");
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Leer (Consultar)
    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(resultSet.getInt("id"));
                estudiante.setNombre(resultSet.getString("nombre"));
                estudiante.setApellido(resultSet.getString("apellido"));
                estudiante.setEdad(resultSet.getInt("edad"));
                estudiante.setCurso(resultSet.getString("curso"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    // Actualizar
    public boolean actualizarEstudiante(Estudiante estudiante) {
        String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, edad = ?, curso = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setInt(3, estudiante.getEdad());
            statement.setString(4, estudiante.getCurso());
            statement.setInt(5, estudiante.getId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Estudiante actualizado satisfactoriamente." +
                        "░░░░░░░░░░░▄▄\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░█░░░█\n" +
                        "░░░░░░░░█░░░░█\n" +
                        "██████▄▄█░░░░░██████▄\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█████░░░░░░░░░█\n" +
                        "█████▀░░░░▀▀██████▀");
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar
    public boolean eliminarEstudiante(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Estudiante eliminado satisfactoriamente." +
                        "░░░░░░░░░░░▄▄\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░░█░░█\n" +
                        "░░░░░░░░░█░░░█\n" +
                        "░░░░░░░░█░░░░█\n" +
                        "██████▄▄█░░░░░██████▄\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█░░░░░░░░░░░░░░█\n" +
                        "▓▓▓▓▓█████░░░░░░░░░█\n" +
                        "█████▀░░░░▀▀██████▀");
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
