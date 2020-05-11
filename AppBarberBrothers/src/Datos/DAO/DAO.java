package Datos.DAO;

import java.util.List;
import java.util.Optional;

public interface DAO <T> {
    
    public void guardar(T t);
    
    public void eliminar(int  id);
    
    public void actualizar(T t);
    
    public Optional<T> obtener(int id);
    
    public List<T> obtenerTodo();
    
    
    
}
