package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaDetalleProducto implements IListaDetalle<DetalleProducto> {

    private final List<DetalleProducto> lista;

    public ListaDetalleProducto() {
        lista = new ArrayList<>();
    }

    @Override
    public Optional<DetalleProducto> conseguirUno(int index) {
        return Optional.ofNullable(lista.get(index));
    }

    @Override
    public List<DetalleProducto> conseguirTodo() {
        return lista;
    }

    @Override
    public void agregar(DetalleProducto item) {
        lista.add(item);
    }

    @Override
    public void borrar(int index) {
        lista.remove(index);
    }

    @Override
    public void borrar(DetalleProducto item) {
        lista.remove(item);
    }
}
