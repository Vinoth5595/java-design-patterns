package behavioral.chainofresponsibility;

public interface Chain {
	public void setNext(Chain nextInChain);

	public void process(CustNumber request);
}
