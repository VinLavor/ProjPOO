package br.ufc.poo.petshop.Funcionarios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import java.io.*;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Petshop {
    public static void main(String[] args) throws IOException {
        String ler;
        Funcionario[] f = new Funcionario[10];
        String[] frase = new String[3];
        for(int i = 0;i<10;i++){
        f[i] = new Funcionario();
        }
        try (BufferedReader leitor = new BufferedReader(new FileReader("funcionario.txt"))) {
            String linha;
            int contador2 = 0;
            while ((linha = leitor.readLine()) != null) {
                String[] palavras = linha.split(":");
                int contador = 0;
                for(String palavra : palavras){
                        if (contador == 0){
                            int tipo = Integer.parseInt(palavra);
                            f[contador2].setTipo(tipo);
                            contador++;
                        } else if(contador == 1){
                            f[contador2].setNome(palavra);
                            contador++;
                        } else if(contador == 2){
                            int idade = Integer.parseInt(palavra);
                            f[contador2].setIdade(idade);
                        }}
                contador2++;
            }
                
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int numLin = 5;
        for(int n = 0; n< numLin; n++){
            System.out.println("---------------------\nNome: " + f[n].getNome() + " |Tipo: " + f[n].getTipo() + " |Idade: " + f[n].getIdade());
        }
        
    }

}
