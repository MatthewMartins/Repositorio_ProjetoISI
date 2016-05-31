package ProjetoPOO.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcionario {

    private long idBDFuncionario;

    private String nomeFun;
    private int idadeFun;
    private String telefoneFun;
    private String ruaFun;
    private String bairroFun;
    private String cidadeFun;
    private long numContrato;
    private int nivelAcesso;
    private List<Avaliacao> listaAvaliacoes;
    private List<Treino> listaTreinos;

    public Funcionario() {
        //O construtor é por causa do framework, pq ele vai utilizar o construtor por baixo dos panos, para criar o BD
        this.listaAvaliacoes = listaAvaliacoes;
        this.listaTreinos = listaTreinos;
    }

    public Funcionario(String nomeFun, int idadeFun, String telefoneFun, String ruaFun, String bairroFun, String cidadeFun, long numContrato, int nivelAcesso, List<Avaliacao> listaAvaliacoes, List<Treino> listaTreinos) {
        this.nomeFun = nomeFun;
        this.idadeFun = idadeFun;
        this.telefoneFun = telefoneFun;
        this.ruaFun = ruaFun;
        this.bairroFun = bairroFun;
        this.cidadeFun = cidadeFun;
        this.numContrato = numContrato;
        this.nivelAcesso = nivelAcesso;
        this.listaAvaliacoes = listaAvaliacoes;
        this.listaTreinos = listaTreinos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getIdBDFuncionario() {
        return idBDFuncionario;
    }

    public void setIdBDFuncionario(long idBDFuncionario) {
        this.idBDFuncionario = idBDFuncionario;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public int getIdadeFun() {
        return idadeFun;
    }

    public void setIdadeFun(int idadeFun) {
        this.idadeFun = idadeFun;
    }

    public String getTelefoneFun() {
        return telefoneFun;
    }

    public void setTelefoneFun(String telefoneFun) {
        this.telefoneFun = telefoneFun;
    }

    public String getRuaFun() {
        return ruaFun;
    }

    public void setRuaFun(String ruaFun) {
        this.ruaFun = ruaFun;
    }

    public String getBairroFun() {
        return bairroFun;
    }

    public void setBairroFun(String bairroFun) {
        this.bairroFun = bairroFun;
    }

    public String getCidadeFun() {
        return cidadeFun;
    }

    public void setCidadeFun(String cidadeFun) {
        this.cidadeFun = cidadeFun;
    }

    public long getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(long numContrato) {
        this.numContrato = numContrato;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @OneToMany(mappedBy = "funcionario", fetch = FetchType.EAGER)
    public List<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }

    @OneToMany(mappedBy = "funcionario", fetch = FetchType.EAGER)
    public List<Treino> getListaTreinos() {
        return listaTreinos;
    }

    public void setListaTreinos(List<Treino> listaTreinos) {
        this.listaTreinos = listaTreinos;
    }

}
