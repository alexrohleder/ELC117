package fuelstation.database.models;

public class Fuel
{
    private Integer id;
    private String type;
    private Float price;

    public Fuel() {
        
    }

    public Fuel(Integer id, String type, Float price) {
        this.id = id;
        this.type = type;
        this.price = price;
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
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return type;
    }
}
