package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.listar.ListarAluno;
import java.util.List;

public interface InterfaceAluno {
    
    public void adicionarAluno (Aluno aluno) throws AlunoExistenteException;
    public void atualizarAluno (Aluno aluno) throws AlunoInexistenteException;
    public void removerAluno (long numMatricula) throws AlunoInexistenteException;
    public List<ListarAluno> listarAlunos();
    public Aluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException;
    
}
