package concesionario;

import java.util.ArrayList;

public interface CRUD<B,I> {
    public ArrayList<B> recuperarTodos();
    public B recuperarUno(I id);
    public B añadir(B data);
    public B eliminar(I id);
    public B modificar(B data);
}