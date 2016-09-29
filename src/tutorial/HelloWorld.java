package tutorial;

import com.opensymphony.xwork2.ActionSupport;
public class HelloWorld extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Name;
	private int Num1;
	private int Num2;
	private int Sum;
	
	public int getSum() {
		return Sum;
	}

	public void setSum(int Sum) {
		this.Sum = Sum;
	}

	public int getNum1() {
		return Num1;
	}

	public void setNum1(int Num1) {
		this.Num1 = Num1;
	}

	public int getNum2() {
		return Num2;
	}

	public void setNum2(int Num2) {
		this.Num2 = Num2;
	}

	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String execute()
	{
		Name = "Hello, " + Name + "!";
		return SUCCESS;
	}
	
	public String addition()
	{
		Sum = Num1 + Num2;
		if(Sum == 100)
			return "!!!";
		return SUCCESS;
	}
}



