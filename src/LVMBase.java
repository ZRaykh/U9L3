import java.util.UUID;

public class LVMBase {
    private String name;
    private UUID u;
    private double size;

    public LVMBase(String n, double s)
    {
        generateUUID();
        name = n;
        size = s;
    }

    private void generateUUID()
    {
        u = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getU() {
        return u;
    }

    public double getSize() {
        return size;
    }

    public void updateSize(double size) {
        this.size = size;
    }
}
