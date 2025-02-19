import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pool.ConnectionPool;

public class GestorSocios implements CRUD<Socio> {
    private ConnectionPool conn;

    public GestorSocios(ConnectionPool conn) {
        this.conn = conn;
    }

    @Override
    public ArrayList<Socio> query(String column, String value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(column))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.preparedStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList query(String column, int valor) {
        List<String> validColumns = Arrays.asList("socioID", "estatura");
        if (!validColumns.contains(column)) {
            throw new SQLException("Columna no valida");
        }

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, valor);

            ResultSet querySet = stmt.executeQuery();
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList requestAll(String sorterBy) {
        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio";
        if (!sorterBy.isEmpty()) {
            sqlQuery += "ORDER BY" + sorterBy;
        }

        try (Statement stmt = this.conn.createStatement(sqlQuery)) {
            ResultSet querySet = stmt.executeQuery(sqlQuery);

            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Socio requestById(int id) {
        Socio result = null;
        String sqlQuery = "SELECT * FROM socio WHERE socioID = ?";

        try (PreparedStatement stmt = this.conn.preparedStatement(sqlQuery)) {
            stmt.setInt(1, id);

            ResultSet querySet = stmt.executeQuery();

            if (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result = new Socio(socioID, nombre, estatura, edad, localidad);
            }
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean create(Socio socio) {
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = "INSERT INTO socio (socioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = this.conn.preparedStatement(sqlQuery)){
            stmt.setInt(1, socioID);
            stmt.setString(2, nombre);
            stmt.setInt(3, estatura);
            stmt.setInt(4, edad);
            stmt.setString(5, localidad);

            //Ejecucuion de la consulta
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Fallo la creacion del nuevo socio"){
                return affectedRows == 1;
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean update(Socio socio) {
        int socioID = socio.getId();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlQuery = ("UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ?");
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.setInt(3, estatura);
            stmt.setString(4, localidad);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Fallo en la actualizacion del socio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean delete(int id) {
        Socio socio = new Socio();
        int socioID = socio.getId();

        String sqlQuery = ("DELETE FROM socio WHERE socioID = ?");
        try (PreparedStatement stmt = this.conn.preparedStatement(sqlQuery)) {
            stmt.setInt(1, socioID);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Fallo al borrar el socio");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
