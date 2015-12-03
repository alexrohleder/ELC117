package fuelstation.database.models.domain;

public class Fuel
{
    private Integer id;
    private Integer idStation;
    private String type;
    private String price;
    private String date;

    public Fuel() {
        
    }

    public Fuel(Integer id, Integer idStation, String type, String price, String date) {
        this.id = id;
        this.idStation = idStation;
        this.type = type;
        this.price = price;
        this.date = date;
    }

    public Integer getIdStation() {
        return idStation;
    }

    public void setIdStation(Integer idStation) {
        this.idStation = idStation;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return type;
    }
}
