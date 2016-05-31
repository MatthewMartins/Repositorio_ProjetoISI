package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.persistencias.RepositorioAluno;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NegocioAluno implements InterfaceAluno {

    @Autowired
    private RepositorioAluno repositorioAluno;

    @Transactional(rollbackFor = AlunoExistenteException.class)
    @Override
    public void adicionarAluno(Aluno aluno) throws AlunoExistenteException {

        try {
            buscarIdAluno(aluno.getNumMatricula());
            throw new AlunoExistenteException();
        } catch (AlunoInexistenteException e) {
            repositorioAluno.save(aluno);
        }
    }

    @Override
    public Aluno buscarIdAluno(long numMatricula) throws AlunoInexistenteException {
        Aluno aluno = repositorioAluno.findByNumMatricula(numMatricula);
        if (aluno == null) {
            throw new AlunoInexistenteException();
        }
        return aluno;
    }

    @Transactional(rollbackFor = AlunoInexistenteException.class)
    @Override
    public void atualizarAluno(Aluno aluno) throws AlunoInexistenteException {
        Aluno antigo = buscarIdAluno(aluno.getNumMatricula());
        antigo.setAvaliacaoAlunos(aluno.getAvaliacaoAlunos());
        antigo.setBairro(aluno.getBairro());
        antigo.setCidade(aluno.getCidade());
        antigo.setIdade(aluno.getIdade());
        antigo.setNome(aluno.getNome());
        antigo.setNumMatricula(aluno.getNumMatricula());
        antigo.setRua(aluno.getRua());
        antigo.setSenha(aluno.getSenha());
        antigo.setTelefone(aluno.getTelefone());
        repositorioAluno.save(antigo);
    }

    @Transactional(rollbackFor = AlunoInexistenteException.class)
    @Override
    public void removerAluno(long numMatricula) throws AlunoInexistenteException {
        repositorioAluno.delete(buscarIdAluno(numMatricula));
    }

    @Override
    public List<Aluno> listarAluno() {
        return (List<Aluno>) repositorioAluno.findAll();
    }
}
