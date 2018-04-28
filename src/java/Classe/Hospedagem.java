package Classe;

import java.util.List;

public class Hospedagem {
  
    String nome;
    String email;
    String telefone;
    String endereco;
    String cargo;
    static List<Hospedagem> listaHospedagens;

    public Hospedagem() {
    }

    public Hospedagem(String nome, String email, String telefone, String endereco, String cargo) {
        if(nome != null )
            this.nome = nome;
        if(email != null)
            this.email = email;        
        this.telefone = telefone;
        if (endereco != null)          
            this.endereco = endereco;
        this.cargo = cargo;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public static List<Hospedagem> getListaHospedagens() {
        return listaHospedagens;
    }
    
    public static void setListaHospedagens (Hospedagem h){
        listaHospedagens.add(h);
    }
    
     
    
}
