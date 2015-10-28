
package T9P1;

class Point
{

    protected double x;
    protected double y;

    public void Ponto(Double x, Double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(Double x, Double y)
    {
        this.x += x;
        this.y += y;
    }

    public void distance(Ponto p)
    {
        double x = p.x - this.x;
        double y = p.y - this.y;

        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
