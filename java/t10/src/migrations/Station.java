package migrations;

import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Alex Rohleder
 */
@Entity
public class Station
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, length = 14)
    private String cnpj;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String razaoSocial;
    
    @Column(nullable = false)
    private String nomeFantasia;
    
    @Column(nullable = false)
    private String bandeira;
    
    @Column(nullable = false)
    private String endereco;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = false)
    private String cep;
    
    @Column(nullable = false)
    private String imagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Station other = (Station) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
