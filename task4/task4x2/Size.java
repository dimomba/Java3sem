package task4x2;

public enum Size {
    XXS(32){
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private String info;
    private int euroSize;
    public String getInfo()
    {
        return this.info;
    }
    public int getEuroSize()
    {
        return this.euroSize;
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }
}
