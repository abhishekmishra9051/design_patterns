package problems;

public class EnergySavingState implements SwitchState {
    private static final EnergySavingState instance = new EnergySavingState();

    private EnergySavingState(){}
    public static EnergySavingState getInstance(){
        return instance;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning ON the switch from energy-saving mode.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF the switch from energy-saving mode.");
    }

    @Override
    public void energySaving() {
        System.out.println("The switch is already in energy-saving mode.");
    }
}
