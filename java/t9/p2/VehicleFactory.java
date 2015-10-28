
package T9P2;

class VehicleFactory
{

    public VehicleCar car(String plate)
    {
        VehicleCar car = new VehicleCar();
                   car.setPlate(plate);
        return car;
    }

    public VehicleMotorcycle motorcycle(String plate)
    {
        VehicleMotorcycle motorcycle = new VehicleMotorcycle();
                          motorcycle.setPlate(plate);
        return motorcycle;
    }

}
