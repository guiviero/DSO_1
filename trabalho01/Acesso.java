/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Acesso {
    private Date horarioDeAcesso;
    private Funcionario funcionario;
    private String conseguiuAcessar;
    private String motivoNaoAcesso;

    public Acesso(Date horarioDeAcesso, Funcionario funcionario, String conseguiuAcessar, String motivoNaoAcesso) {
        this.horarioDeAcesso = horarioDeAcesso;
        this.funcionario = funcionario;
        this.conseguiuAcessar = conseguiuAcessar;
        this.motivoNaoAcesso = motivoNaoAcesso;
    }
    
    
}
