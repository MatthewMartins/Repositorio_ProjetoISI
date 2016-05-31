package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Treino;
import ProjetoPOO.persistencias.RepositorioTreino;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioTreino implements InterfaceTreino {

    @Autowired
    private RepositorioTreino repositorioTreino;

    @Transactional(rollbackFor = TreinoExistenteException.class)
    @Override
    public void adicionarTreino(Treino treino) throws TreinoExistenteException {

        try {
            buscarTreinoId(treino.getIdTreino());
            throw new TreinoExistenteException();
        } catch (TreinoInexistenteException e) {
            repositorioTreino.save(treino);
        }

    }

    @Override
    public Treino buscarTreinoId(long idTreino) throws TreinoInexistenteException {
        Treino treino = repositorioTreino.findByIdTreino(idTreino);
        if (treino == null) {
            throw new TreinoInexistenteException();
        }
        return treino;
    }

    @Transactional(rollbackFor = TreinoInexistenteException.class)
    @Override
    public void atualizarTreino(Treino treino) throws TreinoInexistenteException {
        Treino antigo = buscarTreinoId(treino.getIdTreino());
        antigo.setNomeTreino(treino.getNomeTreino());
        antigo.setDataExpiracao(treino.getDataExpiracao());
        repositorioTreino.save(antigo);
    }

    @Transactional(rollbackFor = TreinoInexistenteException.class)
    @Override
    public void removerTreino(long idTreino) throws TreinoInexistenteException {
        repositorioTreino.delete(buscarTreinoId(idTreino));
    }

    @Override
    public List<Treino> listarTreino() {
        return (List<Treino>) repositorioTreino.findAll();
    }

}
