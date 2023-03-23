public class SD extends LVMBase
{
    private double size;
    private boolean inPV;
    public SD(String n, double s)
    {
        super(n);
        size = s;
        inPV = false;
    }

    public double getSize()
    {
        return size;
    }

    public boolean isInPV()
    {
        return inPV;
    }

    public void addedToPV()
    {
        inPV = true;
    }
}
