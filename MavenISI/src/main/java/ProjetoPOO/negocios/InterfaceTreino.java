package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Treino;
import java.util.List;


public interface InterfaceTreino {
    
    public void adicionarTreino(Treino treino) throws TreinoExistenteException;

    public void atualizarTreino(Treino treino) throws TreinoInexistenteException;

    public void removerTreino(long idTreino) throws TreinoInexistenteException;

    public List<Treino> listarTreino();

    public Treino buscarTreinoId(long idTreino) throws TreinoInexistenteException;
}
