/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author gui_j
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String abrirConta(String nome,String tipo){
        this.setDono(nome);
        this.setTipo(tipo);
        this.setStatus(true);
        
        if(tipo == "CC"){
            this.setSaldo(50);
            return "Conta aberta com sucesso e voce recebeu 50 reais de bonus " + this.getDono();
        }else if(tipo == "CP"){
            this.setSaldo(150);
            return "Conta aberta com sucesso e voce recebeu 150 reais de bonus " + this.getDono();
        }else{
            return "Tipo de conta invalido " + this.getDono();
        }

    }
    
    public String fecharConta(){
        this.setStatus(false);
        if(this.getSaldo() > 0){
            return "Existe dinhero dentro da conta " + this.getDono();
        }else if(this.getSaldo() < 0){
            return "O saldo da conta esta negativo " + this.getDono();
        }else{
            this.setStatus(false);
            return "Conta fechada com sucesso " + this.getDono();
        }
    }
    
    public String depositar(double s){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + s);
            return "Deposito efetuado com sucesso " + this.getDono();
        }else{
            return "A conta nao esta aberta " + this.getDono();
        }
    }
    
    public String sacar(double s){

        if(this.isStatus()){
            if(s <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - s);
                return "Saque efetuado com sucesso " + this.getDono();
            }else{
                return "Saldo insuficiente " + this.getDono();
            } 
        }else{
            return "A conta nao esta aberta " + this.getDono();
        }
    }
    
    public String pagarMensal(){
        
        double v = 0;
        
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if(this.isStatus()){
            if(v <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
                return "Mensalidade paga com sucesso " + this.getDono();
            }else{
                return "Saldo insuficiente para pagar a mensalidade " + this.getDono();
            }
        }else{
            return "a conta nao esta aberta " + this.getDono();
        }
        
    }
    
    public void estadoAtual(){
        System.out.println("------------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipoe: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
    }
    
}
