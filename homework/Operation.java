package homework;

public enum Operation {
	ADD{
		@Override
		public Number compute(Number num1, Number num2) {
			return num1.doubleValue() + num2.doubleValue();
		}
	},
	SUBTRACT{
		@Override
		public Number compute(Number num1, Number num2) {
			return num1.doubleValue() - num2.doubleValue();
		}
	},
	MULTIPLY{
		@Override
		public Number compute(Number num1, Number num2) {
			return num1.doubleValue() * num2.doubleValue();
		}
	},
	DIVIDE{
		@Override
		public Number compute(Number num1, Number num2) {
			if(num2.doubleValue() == 0.0) {
				throw new ArithmeticException("Divide by zero");
			}
			return num1.doubleValue() / num2.doubleValue();
		}
	};
	
	public abstract Number compute(Number num1, Number num2);
}
