package exemplo_escola.model;

public interface Dao <T>{

    boolean salvar(T obj);
    T buscar(int codigo);
    T[] listar();
    boolean excluir(int codigo);
    boolean atualizar(T obj);

}