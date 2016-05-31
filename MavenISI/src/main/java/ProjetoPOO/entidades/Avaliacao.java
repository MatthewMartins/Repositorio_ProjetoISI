package ProjetoPOO.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avaliacao {

    private long idBDAvaliacao;
    
    private long idAvaliacao;
    private float peso;
    private float altura;
    private float peito;
    private float biceps;
    private float triceps;
    private float ombro;
    private float costa;
    private float coxa;
    private float panturrilha;
    private float quadril;
    private Aluno aluno;
    private Funcionario funcionario;

    public Avaliacao() {
        this.aluno = aluno;
        this.funcionario = funcionario;
    }

    public Avaliacao(long idAvaliacao, float peso, float altura, float peito, float biceps, float triceps, float ombro, float costa, float coxa, float panturrilha, float quadril, Aluno aluno, Funcionario funcionario) {
        this.idAvaliacao = idAvaliacao;
        this.peso = peso;
        this.altura = altura;
        this.peito = peito;
        this.biceps = biceps;
        this.triceps = triceps;
        this.ombro = ombro;
        this.costa = costa;
        this.coxa = coxa;
        this.panturrilha = panturrilha;
        this.quadril = quadril;
        this.aluno = aluno;
        this.funcionario = funcionario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getIdBDAvaliacao() {
        return idBDAvaliacao;
    }

    public void setIdBDAvaliacao(long idBDAvaliacao) {
        this.idBDAvaliacao = idBDAvaliacao;
    }

    public long getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(long idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeito() {
        return peito;
    }

    public void setPeito(float peito) {
        this.peito = peito;
    }

    public float getBiceps() {
        return biceps;
    }

    public void setBiceps(float biceps) {
        this.biceps = biceps;
    }

    public float getTriceps() {
        return triceps;
    }

    public void setTriceps(float triceps) {
        this.triceps = triceps;
    }

    public float getOmbro() {
        return ombro;
    }

    public void setOmbro(float ombro) {
        this.ombro = ombro;
    }

    public float getCosta() {
        return costa;
    }

    public void setCosta(float costa) {
        this.costa = costa;
    }

    public float getCoxa() {
        return coxa;
    }

    public void setCoxa(float coxa) {
        this.coxa = coxa;
    }

    public float getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(float panturrilha) {
        this.panturrilha = panturrilha;
    }

    public float getQuadril() {
        return quadril;
    }

    public void setQuadril(float quadril) {
        this.quadril = quadril;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
