package task4x1;

public enum TimesOfYear {
    WINTER("Самое холодное, снежное время года", -12),
    SPRING("В это время года тает снег", 12),
    SUMMER("Самое теплое время года", 24) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("В это время года начинается учеба", 9);

    private String info;
    private int temperature;
    public String getInfo()
    {
        return this.info;
    }
    public int getTemperature()
    {
        return this.temperature;
    }

    TimesOfYear(String info, int temperature) {
        this.info = info;
        this.temperature = temperature;
    }

    public String ILike()
    {
        return this.name();
    }
    public String getDescription(){
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return (this.name() + ": " + this.info + ", средняя температура " + this.temperature + "°");
    }
}
