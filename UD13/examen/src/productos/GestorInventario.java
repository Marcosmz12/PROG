/**
 * 
 */

package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

import crud.CRUD;

public class GestorInventario implements CRUD<Producto>{
    Connection conn;
    public GestorInventario(Connection conn){
        this.conn = conn;
    }
    /**
     * Este metodo nos da todas las columnas de los productos cuando lo ejecutamos.
     * @param sortedBy cogemos todas las columnas que queremos 
     */
    @Override
    public ArrayList<Producto> requestAll(String sortedBy) throws SQLException {
        ArrayList<Producto> result = new ArrayList<Producto>();
        String sqlQuery = "SELECT * FROM productos";
        if (!sortedBy.isEmpty()) {
            sqlQuery += "ORDER BY" + sortedBy;
        }

        try (Statement stmt = this.conn.createStatement()) {
            ResultSet querySet = stmt.executeQuery(sqlQuery);

            while (querySet.next()) {
                long codigo = querySet.getLong("codigo");
                String descripcion = querySet.getString("descripcion");
                double precioCompra = querySet.getDouble("precioCompra");
                double precioVenta = querySet.getDouble("precioVenta");
                int stock = querySet.getInt("stock");
                result.add(new Producto(codigo, descripcion,precioCompra, precioVenta, stock) );
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }   


    /**
     * Con esta funcion nos da el codigo del producto que el usuario ha indicado 
     * @param códigoProducto guardamos el codigo del producto 
    */
    @Override
    public Producto requestById(long códigoProducto) throws SQLException{  
        Producto result = null;
        String sqlQuery = "SELECT * FROM productos WHERE codigo = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, códigoProducto);
            ResultSet querySet = stmt.executeQuery(sqlQuery);
            if (querySet.next()) {
                long codigo = querySet.getLong("codigo");
                String descripcion = querySet.getString("descripcion");
                double precioCompra = querySet.getDouble("precioCompra");
                double precioVenta = querySet.getDouble("precioVenta");
                int stock = querySet.getInt("stock");
                result = new Producto(codigo, descripcion, precioCompra, precioVenta, stock);
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    /**
     * Con esta funcion podemos crear productos
     * @param producto guardamos el producto creado
     */
    @Override
    public boolean create(Producto producto) throws SQLException{ 
        long codio = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();
        String sqlQuery = "INSET INTO socio(codigo, descripcion, precioCompra, precioVenta, stock) VALUES (?,?,?,?,?)";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codio);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precioCompra);
            stmt.setDouble(4, precioVenta);
            stmt.setLong(5, stock);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la creación del nuevo producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    /**
     * Con esta funcion actualizamos los productos 
     * @param producto guardamos el producto actualizado
     */
    @Override
    public boolean update(Producto producto) throws SQLException{  
        long codio = producto.getCodigo();
        String descripcion = producto.getDescripcion();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        int stock = producto.getStock();
        String sqlQuery = "UPDATE productos SET codigo=?, descripcion=?, precioCompra=?, precioVenta=?, stock=? WHERE codigo=?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codio);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precioCompra);
            stmt.setDouble(4, precioVenta);
            stmt.setLong(5, stock);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló la actualización de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

    /**
     * Con esta funcion borramos el producto que el usuario indica
     * @param ccodigoproducto guardamos el codigo que queremos borrar 
     */
    @Override
    public boolean delete(long codigoProcucto) throws SQLException{
        Producto producto = new Producto();
        long codio = producto.getCodigo();
        String sqlQuery = "DELETE FROM productos WHERE codigo = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, codio);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) throw new SQLException("Falló el borrado de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
}