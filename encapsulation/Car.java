public class Car
{
    private String make;
    private String model;
    private int year;
    Car(String make,String model,int y)
    {
        this.setMake(make);
        this.setModel(model);
        this.setyear(y);
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getyear()
    {
        return year;
    }
    public void setMake(String make)
    {
        this.make=make;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setyear(int year)
    {
        this.year=year;
    }
}