package exercises.technology;

public class SmartPhone extends Computer {
    private final String computerType = "Smartphone";
    private String carrier;
    private boolean isLocked = false;

    public SmartPhone(boolean isOn, String instructionSet, double cpuFrequency, String carrier){
        super(isOn, instructionSet, cpuFrequency);
        this.carrier = carrier;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getCarrier() {
        return carrier;
    }

    public boolean getIsLocked(){
        return this.isLocked;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void lock(){
        this.isLocked = true;
    }

    @Override
    public String keyboardType(){
        return "touch";
    }
}
