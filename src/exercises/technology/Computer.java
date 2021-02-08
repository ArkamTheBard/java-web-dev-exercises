package exercises.technology;

public class Computer extends AbstractEntity {
    private boolean isOn;
    private String instructionSet;
    private double cpuFrequency;

    public Computer(boolean isOn, String instructionSet, double cpuFrequency){
        super();
        this.isOn = isOn;
        this.instructionSet = instructionSet;
        this.cpuFrequency = cpuFrequency;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public String getInstructionSet() {
        return instructionSet;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setCpuFrequency(int cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public  String keyboardType() {
        return "external";
    }
}
