package task6x1;

class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    MovablePoint center = new MovablePoint(x,y,xSpeed,ySpeed);
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "x = " + x + "\n" + "y = " + y + "\n" + "xSpeed = " + xSpeed + "\n" + "ySpeed = " + ySpeed;
    }

    @Override
    public void moveUp()
    {
        if(ySpeed > 0) System.out.println("Скорость по у увеличивается");
    }
    @Override
    public void moveDown()
    {
        if(ySpeed < 0) System.out.println("Скорость по у уменьшается");
    }
    @Override
    public void moveLeft()
    {
        if(xSpeed < 0) System.out.println("Скорость по х уменьшается");
    }
    @Override
    public void moveRight()
    {
        if(xSpeed > 0) System.out.println("Скорость по х увеличивается");
    }
}
