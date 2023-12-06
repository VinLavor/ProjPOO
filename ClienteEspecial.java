package br.ufc.poo.petshop.Cliente;
import br.ufc.poo.petshop.Cliente.execao.CEException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class ClienteEspecial extends ClienteAbstrato  {

    public ClienteEspecial( String Nome,String Telefone, String Cpf, int NumeroPets ){
    super(Nome,Telefone,Cpf,NumeroPets);
    }


    public double GetCusto(){
    double CustoTotal = 0;
    for(int i = 0; i < super.GetNumeroDePets() ; i++){
        CustoTotal = CustoTotal + super.Pets[i].CalcValorServico() ;  
    }
    CustoTotal = CustoTotal * 0.80;
    return CustoTotal;
  }


       public void CadastrarCliente() throws CEException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt", true))) {
                   if (!CpfExistente(Cpf, "clientes.txt")) {
                   writer.write("==========================\nCliente especial\nNome: " + Nome + "\nTelefone: " + Telefone + "\nCPF: " + Cpf + "\nCusto Total: " + GetCusto());
             for(int i = 0; i < this.GetNumeroDePets(); i++){
                writer.write("\nPet: " + super.Pets[i].getNome() );
              }
                   writer.newLine(); 

                   System.out.println("Cadastro do cliente realizado com sucesso.");
                   }else{
                     System.out.println("Cliente com CPF " + Cpf + " já cadastrado.");
                      throw new CEException(this.Cpf);
                   }

               } catch (IOException e) {
                   System.err.println("Erro ao cadastrar o cliente: " + e.getMessage());
               }
       }

       
   }
