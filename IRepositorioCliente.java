package br.ufc.poo.petshop.Cliente;

import br.ufc.poo.petshop.Cliente.execao.CEException;
import br.ufc.poo.petshop.Cliente.execao.PRException;
import br.ufc.poo.petshop.Pet.Pet;

import java.io.IOException;

public interface IRepositorioCliente {
    void CadastraPet(Pet pet) throws PRException;
    String GetTelefone();
    String GetNome();
    String GetCpf();
    int GetNumeroDePets();
    double GetCusto();
    void CadastrarCliente() throws CEException;
    boolean CpfExistente(String Cpf, String arquivo) throws IOException;
}