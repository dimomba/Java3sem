package task6x2;

class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
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
