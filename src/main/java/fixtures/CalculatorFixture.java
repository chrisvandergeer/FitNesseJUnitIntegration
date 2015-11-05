package fixtures;

public class CalculatorFixture {
	
	private int leftOperand;
	private int rightOperand;
	private String operator;

	public void leftOperand(String value) {
		this.leftOperand = Integer.parseInt(value);
	}
	
	public void rightOperand(String value) {
		this.rightOperand = Integer.parseInt(value);
	}
	
	public void operator(String value) {
		this.operator = value;
	}
	
	public double calculate() {
		if ("+".equals(operator)) {
			return leftOperand + rightOperand;
		} else if ("-".equals(operator)) {
			return leftOperand - rightOperand;
		} else if ("x".equals(operator)) {
			return leftOperand * rightOperand;
		} else if (":".equals(operator)) {
			return leftOperand / rightOperand;
		}
		throw new RuntimeException("onbekende operator " + operator);
	}


}
