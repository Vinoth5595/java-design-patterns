package behavioral.command;

public class CommandDesignPatternDemo {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		simpleRemoteControl.setCommand(new LightOnCommand(light));
		simpleRemoteControl.buttonPressed();
		simpleRemoteControl.setCommand(new LightOnCommand(light));
		simpleRemoteControl.setCommand(new LightOffCommand(light));
		simpleRemoteControl.buttonPressed();
	}
}
