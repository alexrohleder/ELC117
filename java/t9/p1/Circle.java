
package T9P1;

class Circle
{

    protected Point center;
    protected Double ray;

    public void Circle(Double x, Double y, Double r)
    {
        this.center = new Point(x, y);
        this.ray = r;
    }

    public Point getCenter()
    {
        return this.center;
    }

    public double getArea() {
        return Math.PI * (this.ray ^ 2);
    }

    public double getDiameter() {
        return 2 * this.ray;
    }

}
