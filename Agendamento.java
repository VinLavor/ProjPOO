package br.ufc.poo.petshop.Funcionarios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Agendamento {
    private String data;
    private String horario;
    private String nome;
    private int contadorAgeban;
    private int contadorAgetos;
    private int contadorAgevet;
    
    public Agendamento(){
        
        
    }
    
    
    public void fazAgendamentoBan(String dia,String hora, String n){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgeban.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgeban = Integer.parseInt(linha);
            }
        } catch (IOException e) {
           
        }
        this.nome = n;
        this.data = dia;
        this.horario = hora;
        this.contadorAgeban = contadorAgeban+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("agendamentoban.txt",true));){
            bf.write(nome+";"+data+";"+horario);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgeban.txt",false));){
            String con = Integer.toString(contadorAgeban);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
    }
    
    public void excluiAgeBan(int lnexcluir){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgeban.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgeban = Integer.parseInt(linha);
            }
        } catch (IOException e) {
            
        }
        this.contadorAgeban = contadorAgeban-1;
        int lnexc = lnexcluir;
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentoban.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentotempban.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;

                // Pula a linha que queremos excluir
                if (numeroLinhaAtual == lnexc) {
                    continue;
                }

                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
            
        }
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentotempban.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentoban.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;
                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgeban.txt",false));){
            String con = Integer.toString(contadorAgeban);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }
    
    public void fazAgendamentoTos(String dia,String hora, String n){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgetos.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgetos = Integer.parseInt(linha);
            }
        } catch (IOException e) {
            
        }
        this.nome = n;
        this.data = dia;
        this.horario = hora;
        this.contadorAgetos = contadorAgetos+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("agendamentotos.txt",true));){
            bf.write(nome+";"+data+";"+horario);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgetos.txt",false));){
            String con = Integer.toString(contadorAgetos);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
    }
    
    public void excluiAgeTos(int lnexcluir){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgetos.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgetos = Integer.parseInt(linha);
            }
        } catch (IOException e) {
            
        }
        this.contadorAgetos = contadorAgetos-1;
        int lnexc = lnexcluir;
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentotos.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentotemptos.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;

                // Pula a linha que queremos excluir
                if (numeroLinhaAtual == lnexc) {
                    continue;
                }

                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
            
        }
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentotemptos.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentotos.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;
                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
            
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgetos.txt",false));){
            String con = Integer.toString(contadorAgetos);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }
    
    public void fazAgendamentoVet(String dia,String hora, String n){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgevet.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgevet = Integer.parseInt(linha);
            }
        } catch (IOException e) {
            
        }
        this.nome = n;
        this.data = dia;
        this.horario = hora;
        this.contadorAgevet = contadorAgevet+1;
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("agendamentovet.txt",true));){
            bf.write(nome+";"+data+";"+horario);
            bf.newLine();
        }catch(IOException e){
            System.out.print("Não deu");
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgevet.txt",false));){
            String con = Integer.toString(contadorAgevet);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }

    public void excluiAgeVet(int lnexcluir){
        try (BufferedReader leitor = new BufferedReader(new FileReader("numAgevet.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                this.contadorAgevet = Integer.parseInt(linha);
            }
        } catch (IOException e) {
           
        }
        this.contadorAgevet = contadorAgevet-1;
        int lnexc = lnexcluir;
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentovet.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentotempvet.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;

                // Pula a linha que queremos excluir
                if (numeroLinhaAtual == lnexc) {
                    continue;
                }

                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
           
        }
        try (BufferedReader leitor = new BufferedReader(new FileReader("agendamentotempvet.txt"));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("agendamentovet.txt"))) {

            String linhaAtual;
            int numeroLinhaAtual = 0;

            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinhaAtual++;
                // Escreve a linha no novo arquivo
                escritor.write(linhaAtual);
                escritor.newLine();
            }

        } catch (IOException e) {
          
        }
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter("numAgevet.txt",false));){
            String con = Integer.toString(contadorAgevet);
            bf.write(con);
        }catch(IOException e){
            System.out.print("Não deu");
        }
    }
    
    
    
    
    public String getData() {
        return data;
    }
        
    
    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
