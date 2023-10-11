package MythologyInterface;

abstract class God {
    private String name ;
    private String origin;
    private String SpecialPower;
    public God(String name,String origin,String SpecialPower)
    {
        this.name=name;
        this.origin=origin;
        this.SpecialPower=SpecialPower;
    }

    public String getName() {
        return name;
    }

    public String getSpecialPower() {
        return SpecialPower;
    }

    public String getOrigin() {
        return origin;
    }
    public  abstract  void dispalyInfo();
}
