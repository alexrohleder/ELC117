package fuelstation.database.models.domain;

public class Station
{
    private Integer id;
    private String cnpj;
    private String name;
    private String companyName;
    private String flag;
    private String address;
    private String cep;
    private String image;
    
    public Station() {
        
    }

    public Station(Integer id, String cnpj, String name, String companyName, String flag, String address, String cep, String image) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.companyName = companyName;
        this.flag = flag;
        this.address = address;
        this.cep = cep;
        this.image = image;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
