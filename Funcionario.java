package br.ufc.poo.petshop.Funcionarios;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Funcionario {
    private int contadorBan;
    private int contadorTos;
    private int contadorVet;
    private int tipo;
    private int idade;
    private String nome;
    

    public Funcionario(){
        
        }
    public void criaBanhista(String n, int i, int tipo){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numBan.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorBan = Integer.parseInt(linha);
            }
        } catch (IOException e) {
        }
        this.nome = n;
        this.idade = i;
        this.tipo = tipo;
        this.contadorBan = contadorBan+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("funcionario.txt",true));){
            bf.write(tipo+":"+nome+":"+idade);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numBan.txt",false));){
            String con = Integer.toString(contadorBan);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        
    }
    
    public void criaTosador(String n, int i, int tipo){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numTos.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorTos = Integer.parseInt(linha);
            }
        } catch (IOException e) {
        }
        this.nome = n;
        this.idade = i;
        this.tipo = tipo;
        this.contadorTos = contadorTos+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("funcionario.txt",true));){
            bf.write(tipo+":"+nome+":"+idade);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numTos.txt",false));){
            String con = Integer.toString(contadorTos);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }
    
    public void criaVeterinario(String n, int i, int tipo){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numVet.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorVet = Integer.parseInt(linha);
            }
        } catch (IOException e) {
        }
        this.nome = n;
        this.idade = i;
        this.tipo = tipo;
        this.contadorVet = contadorVet+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("funcionario.txt",true));){
            bf.write(tipo+":"+nome+":"+idade);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numVet.txt",false));){
            String con = Integer.toString(contadorVet);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }
    

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }
    
    
    }
    
