
package T9P2;

import java.lang.Math;
import java.util.Random;

class Parking
{

    public VehicleAbstract vehicle;
    public Double vehicleEntranceHour;

    public Boolean in(VehicleAbstract vehicle)
    {
        if (this.vehicle === null) {
            this.vehicle = vehicle;
            this.vehicleEntranceHour = System.currentTimeMillis();

               return true;
        } else return false;
    }

    public ArrayList out()
    {
        Random rand = new Random();
        Double time = Math.round((System.currentTimeMillis() - this.vehicleEntranceHour) / 3600000 + rand.nextInt(5));

        ArrayList list = new ArrayList();
                  list.add(this.vehicle.getPlate());
                  list.add(time < 1 ? this.getVehicleHoursTax() : this.getVehicleHoursTax() * time);
                  list.add(time);
        this.vehicle = null;

        return list;
    }

    protected double getVehicleHoursTax()
    {
        if (this.vehicle instanceof VehicleCar) {
               return 3.0;
        } else return 1.5;
    }

}
