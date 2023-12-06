/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufc.poo.petshop.Pet;


public class Pet {
    private String nomePet;
    private String tipo;
    private String observacoes;
    private int idadePet;
    private double pesoPet;
    private int[] servicos=new int[3];
    private int indice = 0;
    int valorServico1=10;
    int valorServico2=20;
    int valorServico3=30;

    public Pet(String nomePet, String tipo, String observacoes, int idadePet, double pesoPet) {
        this.nomePet = nomePet;
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.idadePet = idadePet;
        this.pesoPet = pesoPet;
    }
   
   
    
    public void cadastrarServico(int servico) {       
        for (int i = 0; i < 3; i++) {       
            if(servicos[i]==0){
               servicos[indice]=servico; 
               indice++;                   
               return;               
            }               
        }               
    }
    public void resetServico() {       
        for (int i = 0; i < 3; i++) {       
            this.servicos[i]=0; 
            this.indice=0;
        }               
    }
    
    public void Nome(String nome){
        this.nomePet=nome;
        System.out.println(this.nomePet);

    }
    public void Tipo(String tipo){
        this.tipo=tipo;
        System.out.println(this.tipo);
    }
    public void Observacoes(String observacoes){
        this.observacoes=observacoes;
        System.out.println(this.observacoes);
    }
    public void IdadePet(int idade){
        this.idadePet=idade;
        System.out.println(this.idadePet);
    }
    public double CalcValorServico(){
        double custoPet =0;
        for (int index = 0; index < servicos.length; index++) {
            switch (servicos[index]) {
                case 1:
                    custoPet=custoPet+valorServico1;
                    break;
                case 2:
                    custoPet=custoPet+valorServico2;
                    break;
                case 3:
                    custoPet=custoPet+valorServico3;
                    break;
                default:
                    break;
            }
        }
        return custoPet;
        
    }
    public void PesoPet(double peso){
        this.pesoPet=peso;
        System.out.println(this.pesoPet);
    }
    //gets
    public String getNome() {
      return this.nomePet;
    }
    public int[] getServicos() {
        return this.servicos;
    }
    public String getTipo() {
      return this.tipo;
    }
    
}
