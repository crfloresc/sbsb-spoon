package domain;

import java.util.List;
import java.util.Optional;

public interface IListaDetalle<T> {

    public Optional<T> conseguirUno(int index);
    public List<T> conseguirTodo();
    public void agregar(T item);
    public void borrar(int index);
    public void borrar(T item);
}
