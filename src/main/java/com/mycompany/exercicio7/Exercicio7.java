/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio7;

/**
 *
 * @author Fabricio de Aguiar
 */
/**Escreva um programa em JAVA que solicite ao usuário um nome, armazene em
uma variável e depois mostre o nome digitado em uma mensagem.*/

import javax.swing.JOptionPane;
public class Exercicio7 {
    public static void main(String[] args){
     String nome = JOptionPane.showInputDialog("Digite seu nome:");
     JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
     
    
    }
}
