public class PV extends SD
{
    private boolean inVG;

    public PV(String n, double s)
    {
        super(n, s);
        inVG = false;
    }

    public boolean isInVG() {
        return inVG;
    }

    public void addedToVG() {
        inVG = true;
    }
}
