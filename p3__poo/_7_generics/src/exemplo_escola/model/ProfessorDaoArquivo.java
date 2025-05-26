package exemplo_escola.model;

public class ProfessorDaoArquivo implements Dao<Professor> {
    @Override
    public boolean salvar(Professor obj) {
        return false;
    }

    @Override
    public Professor buscar(int codigo) {
        return null;
    }

    @Override
    public Professor[] listar() {
        return new Professor[0];
    }

    @Override
    public boolean excluir(int codigo) {
        return false;
    }

    @Override
    public boolean atualizar(Professor obj) {
        return false;
    }
}