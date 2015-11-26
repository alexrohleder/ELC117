package fuelstation.database.models;

public class Station
{
    private Integer id;
    private Integer cnpj;
    private String name;
    private String companyName;
    private Flag flag;
    private String address;
    private Integer cep;
    private String image;
    
    public Station() {
        
    }

    public Station(Integer id, Integer cnpj, String name, String companyName, Flag flag, String address, Integer cep) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.companyName = companyName;
        this.flag = flag;
        this.address = address;
        this.cep = cep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
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

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
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
