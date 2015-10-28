
package T9P1;

class Main
{

    public static void main(String[] args)
    {
        Circle c1 = new Circle(10, 10, 5);
        Circle c2 = new Circle(20, 20, 5);

        this.printCircle(c1);
        this.printCircle(c2);

        System.out.printf("Distancia de um circulo ao outro é de %.2f\n", c1.getCenter().getDistance(c2));
    }

    public static void printCircle(Circle c)
    {
        System.out.printf("Círculo de área '%.2f' e diâmetro '%.2f'\n", c.getArea(), c.getDiameter());
    }

}
