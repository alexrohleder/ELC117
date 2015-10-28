
package T9P2;

class Main
{

    public static void main(String[] args)
    {
        Parking parking = new Parking();
        VehicleFactory factory = new VehicleFactory();

        VehicleAbstract car = factory.car("ABC1234");
        VehicleAbstract motorcycle = factory.motorcycle("DEF5678"); 

        doInOut(p, car);
        doInOut(p, motorcycle);
    }

    public static void doInOut(Parking p, VehicleAbstract v)
    {
        p.in(v);

        ArrayList s = p.out();

        // O total de horas é gerado aleatóriamente entre 0 e 5.
        System.out.printf("Veiculo '%s' deverá pagar R$%s.00 por %s horas.", s[0], s[1], s[2]);
    }

}
