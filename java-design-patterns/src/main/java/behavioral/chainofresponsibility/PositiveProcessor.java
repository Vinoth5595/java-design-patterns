package behavioral.chainofresponsibility;

public class PositiveProcessor implements Chain {
	private Chain nextInChain;

	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void process(CustNumber request) {
		if (request.getNumber() > 0) {
			System.out.println("Positive Number : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}

}
