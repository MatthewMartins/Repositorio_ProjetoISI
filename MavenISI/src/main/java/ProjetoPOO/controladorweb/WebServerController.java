package ProjetoPOO.controladorweb;

import ProjetoPOO.entidades.Aluno;
import ProjetoPOO.entidades.Avaliacao;
import ProjetoPOO.entidades.Exercicio;
import ProjetoPOO.entidades.Funcionario;
import ProjetoPOO.entidades.Treino;
import ProjetoPOO.negocios.InterfaceFachada;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//usar anotação @Controller para poder usar os formularios
@Controller
@RestController
@RequestMapping("/Controlador")
public class WebServerController {
 
    @Autowired
    private InterfaceFachada fachada;
    //aqui no listar talvez nao tenha o produces = MediaType...
   @RequestMapping(value = "aluno/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Aluno> listarAluno() {
        return this.fachada.listarAluno();
    }

    //o @requestMapping recebe um atributo chamado value que indica qual será a URL utilizada para chamar o método.
    @RequestMapping("aluno/adicionar")
    public ResponseEntity<?> adicionarAluno(@RequestBody Aluno aluno) {
        try {
            System.out.println("chegou aqui");
            this.fachada.adicionarAluno(aluno);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping("aluno/atualizar"/*, produces = MediaType.APPLICATION_JSON_VALUE*/)
    public ResponseEntity<?> atualizarAluno(@RequestBody Aluno aluno) {

        try {
            this.fachada.atualizarAluno(aluno);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("aluno/buscar")
    public ResponseEntity<?> buscarAlunoID(long numMatricula) {

        try {
            Aluno aluno = this.fachada.buscarIdAluno(numMatricula);
            return new ResponseEntity<Aluno>(aluno, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        

    }

    @RequestMapping("aluno/remover")
    public ResponseEntity<?> removerAluno(long numMatricula) {

        try {
            this.fachada.removerAluno(numMatricula);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("avaliacao/adicionar")
    public ResponseEntity<?> adicionarAvaliacao(@RequestBody Avaliacao avaliacao) {

        try {
            this.fachada.adicionarAvaliacao(avaliacao);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("avaliacao/atualizar")
    public ResponseEntity<?> atualizarAvaliacao(@RequestBody Avaliacao avaliacao) {

        try {
            this.fachada.atualizarAvaliacao(avaliacao);
            
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("avaliacao/remover")
    public ResponseEntity<?> removerAvaliacao(long idAvaliacao) {

        try {
            this.fachada.removerAvaliacao(idAvaliacao);
            
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }
    
    @RequestMapping(value = "avaliacao/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Avaliacao> listarAvaliacao() {
        return this.fachada.listarAvaliacao();
    }

    @RequestMapping("avaliacao/buscar")
    public ResponseEntity<?> buscarAvaliacaoID(long idAvaliacao) {

        try {
            Avaliacao avaliacao = this.fachada.buscarIdAvaliacao(idAvaliacao);
            return new ResponseEntity<Avaliacao>(avaliacao, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping("funcionario/adicionar")
    public ResponseEntity<?> adicionarFuncionario(@RequestBody Funcionario funcionario) {

        try {
            this.fachada.adicionarFuncionario(funcionario);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("funcionario/atualizar")
    public ResponseEntity<?> atualizarFuncionario(@RequestBody Funcionario funcionario) {

        try {
            this.fachada.atualizarFuncionario(funcionario);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("funcionario/remover")
    public ResponseEntity<?> removerFuncionario(long numContrato) {

        try {
            this.fachada.removerFuncionario(numContrato);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "funcionario/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Funcionario> listarFuncionario() {
        return this.fachada.listarFuncionario();
    }

    @RequestMapping("funcionario/buscar")
    public ResponseEntity<?> buscarNumContratoFuncionario(long numContrato) {

        try {
            Funcionario funcionario = this.fachada.buscarNumContratoFuncionario(numContrato);
            return new ResponseEntity<Funcionario>(funcionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        

    }

    @RequestMapping("treino/adicionar")
    public ResponseEntity<?> adicionarTreino(@RequestBody Treino treino) {

        try {
            this.fachada.adicionarTreino(treino);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("treino/atualizar")
    public ResponseEntity<?> atualizarTreino(@RequestBody Treino treino) {

        try {
            this.fachada.atualizarTreino(treino);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("treino/remover")
    public ResponseEntity<?> removerTreino(long idTreino) {

        try {
            this.fachada.removerTreino(idTreino);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "treino/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Treino> listarTreino() {
        return this.fachada.listarTreino();
    }

    @RequestMapping("treino/buscar")
    public ResponseEntity<?> buscarTreinoId(long idTreino) {

        try {
            Treino treino = this.fachada.buscarTreinoId(idTreino);
            return new ResponseEntity<Treino>(treino, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        

    }

    @RequestMapping("exercicio/adicionar")
    public ResponseEntity<?> adicionarExercicio(@RequestBody Exercicio exercicio) {

        try {
            this.fachada.adicionarExercicio(exercicio);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("exercicio/atualizar")
    public ResponseEntity<?> atualizarExercicio(@RequestBody Exercicio exercicio) {

        try {
            this.fachada.atualizarExercicio(exercicio);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping("exercicio/remover")
    public ResponseEntity<?> removerExercicio(long idExercicio) {

        try {
            this.fachada.removerExercicio(idExercicio);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @RequestMapping(value = "exercicio/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Exercicio> listarExercicio() {
        return this.fachada.listarExercicio();
    }

    @RequestMapping("exercicio/buscar")
    public ResponseEntity<?> buscarExercicioId(long idExercicio) {

        try {
            Exercicio exercicio = this.fachada.buscarExercicioId(idExercicio);
            return new ResponseEntity<Exercicio>(exercicio, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
        }
    }
    
    //-----------------------------------------------------------------------------------
    @RequestMapping("/cadastroAluno")
    public String formularioCadastrarAluno (){
        return "cadastroAluno";
    }
    
    
    
}
