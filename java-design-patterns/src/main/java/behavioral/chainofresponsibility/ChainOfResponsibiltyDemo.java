package behavioral.chainofresponsibility;

public class ChainOfResponsibiltyDemo {

	public static void main(String[] args) {
		Chain chain1 = new ZeroProcessor();
		Chain chain2 = new PositiveProcessor();
		Chain chain3 = new NegativeProcessor();
		
		chain1.setNext(chain2);
		chain2.setNext(chain3);
		
		chain1.process(new CustNumber(-3));
		chain1.process(new CustNumber(-35));
		chain1.process(new CustNumber(3));
		chain1.process(new CustNumber(0));
		chain1.process(new CustNumber(56));
	}

}
