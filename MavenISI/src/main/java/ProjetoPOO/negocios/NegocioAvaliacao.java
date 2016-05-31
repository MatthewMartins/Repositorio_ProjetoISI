package ProjetoPOO.negocios;

import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.persistencias.RepositorioAvaliacao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NegocioAvaliacao implements InterfaceAvaliacao {

    @Autowired
    private RepositorioAvaliacao repositorioAvaliacao;

    @Transactional(rollbackFor = AvaliacaoExistenteException.class)
    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao) throws AvaliacaoExistenteException {

        try {
            buscarIdAvaliacao(avaliacao.getIdAvaliacao());
            throw new AvaliacaoExistenteException();
        } catch (AvaliacaoInexistenteException e) {
            repositorioAvaliacao.save(avaliacao);
        }
    }

    @Override
    public Avaliacao buscarIdAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        Avaliacao avaliacao = repositorioAvaliacao.findByIdAvaliacao(idAvaliacao);
        if (avaliacao == null) {
            throw new AvaliacaoInexistenteException();
        }
        return avaliacao;
    }

    @Transactional(rollbackFor = AvaliacaoInexistenteException.class)
    @Override
    public void atualizarAvaliacao(Avaliacao avaliacao) throws AvaliacaoInexistenteException {
        Avaliacao antiga = buscarIdAvaliacao(avaliacao.getIdAvaliacao());
        antiga.setPeso(avaliacao.getPeso());
        antiga.setAltura(avaliacao.getAltura());
        antiga.setPeito(avaliacao.getPeito());
        antiga.setBiceps(avaliacao.getBiceps());
        antiga.setTriceps(avaliacao.getTriceps());
        antiga.setOmbro(avaliacao.getOmbro());
        antiga.setCosta(avaliacao.getCosta());
        antiga.setCoxa(avaliacao.getCoxa());
        antiga.setPanturrilha(avaliacao.getPanturrilha());
        antiga.setQuadril(avaliacao.getQuadril());
        repositorioAvaliacao.save(antiga);

    }

    @Transactional(rollbackFor = AvaliacaoInexistenteException.class)
    @Override
    public void removerAvaliacao(long idAvaliacao) throws AvaliacaoInexistenteException {
        repositorioAvaliacao.delete(buscarIdAvaliacao(idAvaliacao));
    }

    @Override
    public List<Avaliacao> listarAvaliacao() {
        return (List<Avaliacao>) repositorioAvaliacao.findAll();
    }
}
