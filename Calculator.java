class Calculator
{
    public void multiply (int a, int b) {
        int res = a*b;
        System.out.println(res);
    }
    public void division (int a, int b) {
        int res = a/b;
        System.out.println(res);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int num1=139;
	    int num2=6;
		Calculator cal = new Calculator();
		cal.multiply(num1,num2);
		cal.division(num1,num2);
	}
}
