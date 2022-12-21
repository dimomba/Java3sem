package task7x1;

class MovableRectangle extends MovablePoint implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2)
    {
        super(x1, y1, xSpeed1, ySpeed1);
        topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }

    public String toString()
    {
        return "Координата верхней левой точки: (" + topLeft.getX() + "; " + topLeft.getY() + ")\n" + "Координата нижней правой точки: (" + bottomRight.getX() + "; " + bottomRight.getY() + ")";
    }

    private boolean SpeedTest(MovablePoint topLeft, MovablePoint bottomRight)
    {
        if(topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed)
            return true;
        else
            return false;
    }

    @Override
    public void moveUp()
    {
        if(SpeedTest(topLeft, bottomRight))
            if(ySpeed > 0)
                System.out.println("Скорость по у увеличивается");
    }
    @Override
    public void moveDown()
    {
        if(SpeedTest(topLeft, bottomRight))
            if(ySpeed < 0)
                System.out.println("Скорость по у уменьшается");
    }
    @Override
    public void moveLeft()
    {
        if(SpeedTest(topLeft, bottomRight))
            if(xSpeed < 0)
                System.out.println("Скорость по х уменьшается");
    }
    @Override
    public void moveRight()
    {
        if(SpeedTest(topLeft, bottomRight))
            if(xSpeed > 0)
                System.out.println("Скорость по х увеличивается");
    }
}
