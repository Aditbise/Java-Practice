class vehical 
{
    void p()
    {
        System.out.println("HEllo from vehical");
    }
}
class car extends vehical
{
    void pp()
    {
        System.out.println("Hello from car");
    }
}
class colour extends car
{
    void ppp()
    {
        System.out.println("Hello from colour");
    }
}
class databasecar
{
    public static void main(String args[])
    {
        colour c=new colour();
        c.ppp();
        c.pp();
        c.p();
    }
}
