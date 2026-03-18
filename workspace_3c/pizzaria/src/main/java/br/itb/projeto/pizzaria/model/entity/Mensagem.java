package br.itb.projeto.pizzaria.model.entity;
 
import java.time.LocalDateTime;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "Mensagem")
public class Mensagem {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    @Column(name="id")
  private Long id;
 
    @Column(name="dataMensagem")
  private LocalDateTime dataMensagem;
 
    @Column(name="emissor")
  private String emissor;
 
    @Column(name="username")
  private String username;
 
    @Column(name="telefone")
  private String telefone;
 
    @Column(name="texto")
  private String texto;  
 
    @Column(name="statusMensagem")
  private String statusMensagem;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public LocalDateTime getDataMensagem() {
        return dataMensagem;
    }
 
    public void setDataMensagem(LocalDateTime dataMensagem) {
        this.dataMensagem = dataMensagem;
    }
 
    public String getEmissor() {
        return emissor;
    }
 
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public String getTexto() {
        return texto;
    }
 
    public void setTexto(String texto) {
        this.texto = texto;
    }
 
    public String getStatusMensagem() {
        return statusMensagem;
    }
 
    public void setStatusMensagem(String statusMensagem) {
        this.statusMensagem = statusMensagem;
    }
 
 
 
}
 
 
 