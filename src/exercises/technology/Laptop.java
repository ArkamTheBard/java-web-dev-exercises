package exercises.technology;

public class Laptop extends Computer {
    private final String computerType = "Laptop";
    private String os;
    private boolean isClosed = false;

    public Laptop(boolean isOn, String instructionSet, double cpuFrequency, String os){
        super(isOn, instructionSet, cpuFrequency);
        this.os = os;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getOs() {
        return os;
    }

    public boolean getIsClosed(){
        return isClosed;
    }

    public void close(){
        this.isClosed = true;
    }

    @Override
    public String keyboardType(){
        return "integrated";
    }
}
