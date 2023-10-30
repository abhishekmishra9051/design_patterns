package problems;

class OnState implements SwitchState {
    public static OnState instance;

    private OnState() {
        instance = null;
    }
    public static OnState getInstance() {
        if(instance==null)
            instance = new OnState();

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
