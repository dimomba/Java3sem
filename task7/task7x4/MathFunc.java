package task7x4;

class MathFunc implements MathCalculable
{
    private int radius;
    private String complexNum;

    MathFunc(int radius, String complexNum)
    {
        this.radius = radius;
        this.complexNum = complexNum;
    }

    @Override
    public double degree(double degree)
    {
        return Math.pow(radius, degree);
    }

    @Override
    public int modComplex()
    {
        String first[] = complexNum.split(" ", 2);
        return Integer.parseInt(first[0]);
    }
}
