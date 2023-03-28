import java.util.ArrayList;
public class LVMManager {
    private ArrayList<SD> currentSDS;
    private ArrayList<PV> currentPVs;
    private ArrayList<VG> currentVGs;
    private ArrayList<LV> currentLVs;
    public LVMManager(){
        currentSDS = new ArrayList<SD>();
        currentPVs = new ArrayList<PV>();
        currentVGs = new ArrayList<VG>();
        currentLVs = new ArrayList<LV>();
    }

    public ArrayList<SD> getCurrentSDS() {
        return currentSDS;
    }

    public ArrayList<PV> getCurrentPVs() {
        return currentPVs;
    }

    public ArrayList<VG> getCurrentVGs() {
        return currentVGs;
    }

    public ArrayList<LV> getCurrentLVs() {
        return currentLVs;
    }

    //SD methods
    public boolean createSD(String name, double size)
    {
        for (SD sd: currentSDS)
        {
            if (sd.getName().equals(name))
                return false;
        }
        SD sd = new SD(name,size);
        currentSDS.add(sd);
        return true;
    }

    public ArrayList<String> installedSDs()
    {
        ArrayList<String> installed = new ArrayList<String>();
        for (SD sd: currentSDS)
        {
            installed.add(sd.SDData());
        }
        return installedSDs();
    }

    //PV methods
    public boolean existingPV(String pvName)
    {
        for (PV pv: currentPVs)
        {
            if (pv.getName().equals(pvName))
            {
                return true;
            }
        }
        return false;
    }

    public boolean existingSD(String sdName)
    {
        for (SD sd : currentSDS)
        {
            if (sd.getName().equals(sdName))
            {
                return true;
            }
        }
        return false;
    }

    public boolean createSD(String pvName, String sdName)
    {

    }
}
