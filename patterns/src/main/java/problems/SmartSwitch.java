package problems;

public class SmartSwitch {

    private SwitchState currentState;

    public SmartSwitch(){
        currentState = OffState.getInstance();
    }

    public void setState(SwitchState state){
        currentState = state;
    }

    public void turnOn(){
        currentState.turnOn();
        setState(OnState.getInstance());
    }

    public void turnOff(){
        currentState.turnOff();
        setState(OffState.getInstance());
    }

    public void energySaving(){
        currentState.energySaving();
        setState(EnergySavingState.getInstance());
    }
}
