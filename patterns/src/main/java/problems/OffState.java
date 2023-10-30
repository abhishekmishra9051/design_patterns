package problems;

public class OffState implements SwitchState {
    private static final OffState instance = new OffState();

    private OffState(){}

    public static OffState getInstance(){
        return instance;
    }

    @Override
    public void turnOn() {
        System.out.println("The switch is already ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF the switch.");
    }

    @Override
    public void energySaving() {
        System.out.println("Switching to energy-saving mode.");
    }
}
