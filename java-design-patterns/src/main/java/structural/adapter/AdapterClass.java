package structural.adapter;

public class AdapterClass extends AdapteeClass implements TargetInterface {

	public void getExistingData() {
		setId(1);
		System.out.println("Client Implementation " + getId());
	}

	public void newClientData() {
		setId(2);
		System.out.println("client Implementation " + getId());
	}

}
