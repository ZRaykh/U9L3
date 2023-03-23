import java.util.UUID;

public class LVMBase {
    private String name;
    private UUID u;

    public LVMBase(String n)
    {
        generateUUID();
        name = n;
    }

    private void generateUUID()
    {
        u = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return u;
    }

}
