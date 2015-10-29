
package T9P2;

import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Parking parking = new Parking();
        VehicleFactory factory = new VehicleFactory();

        VehicleAbstract car = factory.car("ABC1234");
        VehicleAbstract motorcycle = factory.motorcycle("DEF5678"); 

        doInOut(parking, car);
        doInOut(parking, motorcycle);
    }

    public static void doInOut(Parking p, VehicleAbstract v)
    {
        p.in(v);

        ArrayList s = p.out();
        
        System.out.printf("Veiculo '%s' deverá pagar R$%.2g por %s horas.\n", s.get(0), s.get(1), s.get(2));
    }

}
