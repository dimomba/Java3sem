package task20x1;

public class AnimalExtended extends Animal{
    private Integer iHeight;

    public AnimalExtended(Integer iAge, String stName, Integer iHeight) {
        super(iAge, stName);
        this.iHeight = iHeight;
    }
}
