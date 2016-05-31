/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPOO.controladorweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Matheus
 */
@Controller
public class ControllerJSP {
   
    //NAO MEXER AQUI POR ENQUANTO
    
    @RequestMapping("/cadastroAluno")
    public String formCadastroAlunos() {
        return "cadastroAluno";
    }
}
