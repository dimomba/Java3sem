package task6x11;

class Degree implements Convertable
{
    private int degrees;
    public Degree(int c)
    {
        this.degrees = c;
    }
    @Override
    public String convert()
    {
        return "Температура в Цельсиях: " + degrees + "\nТемпература в Кельвинах: " + (degrees + 273.15) +
                "\nТемпература в Фаренгейтах: " + (degrees * 1.8 + 32);
    }
}
