package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaDetalleServicio implements IListaDetalle<DetalleServicio> {

    private final List<DetalleServicio> lista;

    public ListaDetalleServicio() {
        lista = new ArrayList<>();
    }

    @Override
    public Optional<DetalleServicio> conseguirUno(int index) {
        return Optional.ofNullable(lista.get(index));
    }

    @Override
    public List<DetalleServicio> conseguirTodo() {
        return lista;
    }

    @Override
    public void agregar(DetalleServicio item) {
        lista.add(item);
    }

    @Override
    public void borrar(int index) {
        lista.remove(index);
    }

    @Override
    public void borrar(DetalleServicio item) {
        lista.remove(item);
    }
}
