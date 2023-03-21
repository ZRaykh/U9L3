import java.util.ArrayList;
public class VG extends LVMBase{
    private ArrayList<PV> pvs;

    public VG(String n, PV pv)
    {
        super(n, pv.getSize());
        pvs.add(pv);
    }

    public void addPV(PV pv)
    {
        pvs.add(pv);
        super.updateSize(super.getSize() + pv.getSize());
    }
}
