import java.util.ArrayList;
public class VG extends LVMBase{
    private ArrayList<PV> pvs;
    private ArrayList<LV> lvs;


    public VG(String n, PV pv)
    {
        super(n);
        pvs.add(pv);
    }

    public void addPV(PV pv)
    {
        pvs.add(pv);
    }
    public void addLV(LV lv)
    {
        lvs.add(lv);
    }

    public double totalSize()
    {
        double sum = 0;
        for (PV pv : pvs) {
            sum += pv.getSize();
        }
        for (PV pv : pvs) {
            sum += pv.getSize();
        }
        return sum;
    }
}
