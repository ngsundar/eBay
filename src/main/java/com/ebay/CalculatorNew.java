package com.ebay;

public class CalculatorNew
{
	class Chain {
		private Operation op;
		private Number num;
		
		Chain(Operation op, Number num) {
			this.op = op;
			this.num = num;
		}
		
		Operation getOperation() {
			return this.op;
		}
		
		Number getOperand() {
			return this.num;
		}
	}

	public Number calculate(Operation op, Number num1, Number num2) {
		return op.compute(num1, num2);
	}
	
	public Number evaluate(Number initial, Chain... chains) {
		Number result = initial;
		for(Chain chain : chains) {
			result = calculate(chain.getOperation(), result, chain.getOperand());
		}
		return result;
	}

	/* Given an arithmetic expression as a string, evaluate with operator precedence 
	 * which can be overridden by parentheses. For example 4 + 2 * 3 should return 10 
	 * and (4 + 2) * 3 should return 18
	 */
	public Number evaluate(String expr) {
		return null;
	}
}
