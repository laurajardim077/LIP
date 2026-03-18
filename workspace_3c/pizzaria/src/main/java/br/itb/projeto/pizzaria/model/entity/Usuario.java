package br.itb.projeto.pizzaria.model.entity;
 
import java.time.LocalDateTime;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "Usuario")
public class Usuario {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
 
    @Column(name="id")
     private long id;
   
     @Column(name="name")
     private String nome;
     
     @Column(name="username")
     private String username;  
     
     @Column(name="nivelAcesso")
     private String nivelAcesso;
     
     @Column(name="foto")
     private byte[] foto;          
 
     @Column(name="name")
     private LocalDateTime dataCadastro;
 
     @Column(name="dataCadastro")
     private LocalDateTime dataAtualizacao;
 
     @Column(name="statusUsuario")
     private String statusUsuario;
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getNivelAcesso() {
        return nivelAcesso;
    }
 
    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
 
    public byte[] getFoto() {
        return foto;
    }
 
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
 
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
 
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
 
    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }
 
    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
 
    public String getStatusUsuario() {
        return statusUsuario;
    }
 
    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
 
 
}
 
 