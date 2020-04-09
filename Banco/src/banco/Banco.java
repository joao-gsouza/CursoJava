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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        System.out.println(c1.abrirConta("Jubileu", "CC"));
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        System.out.println(c2.abrirConta("Creuza", "CP"));
        
        System.out.println(c1.depositar(100));
        System.out.println(c2.depositar(500));
        
        System.out.println(c2.sacar(100));
        
        c1.estadoAtual();
        c2.estadoAtual();
        
        /*
        ContaBanco c1 = new ContaBanco();
        Scanner teclado = new Scanner(System.in);
        int menu;
        
        do{
            System.out.println("Bem-Vendo ao banco");
            System.out.println("1 - abrir conta");
            System.out.println("2 - fechar conta");
            System.out.println("3 - depositar");
            System.out.println("4 - sacar");
            System.out.println("5 - pagar mensalidade");
            System.out.println("6 - Consultar saldo");
            System.out.println("0 - sair");
            menu = teclado.nextInt();

            if(menu == 1){
                System.out.println("Digite o tipo da conta, CC para corrente, CP para poupança");
                String tipo = teclado.next();
                System.out.println("Digite o seu nome");
                String nome = teclado.next();
                String resultado = c1.abrirConta(nome,tipo);
                System.out.println(resultado);;
            }else if(menu == 2){
                String resultado = c1.fecharConta();
                System.out.println(resultado);
            }else if(menu == 3){
                System.out.println("Digite o valor do deposito");
                double valor = teclado.nextDouble();
                String resultado = c1.depositar(valor);
                System.out.println(resultado);
            }else if(menu == 4){
                System.out.println("Digite o valor do saque");
                double valor = teclado.nextDouble();
                String resultado = c1.sacar(valor);
                System.out.println(resultado);
            }else if(menu == 5){
                String resultado = c1.pagarMensal();
                System.out.println(resultado);
            }else if(menu == 6){
                System.out.println("Seu saldo é: "+c1.getSaldo());
            }else if(menu == 0){
                System.out.println("Saindo ...");
            }else{
                System.out.println("Valor invalido");
            }
        }while(menu != 0);*/
    }
    
}
