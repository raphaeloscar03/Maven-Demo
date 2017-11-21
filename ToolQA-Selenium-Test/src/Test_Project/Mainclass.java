package Test_Project;

public class Mainclass {
	public static void main(String []args) {
		Subclass x = new Subclass();
		x.bBool1 = true;
		x.iNum1 = 25;
		x.iNum2 = 30;
		x.sStr1 = "Value is acceptable";
		x.fFlo1 = (float) 5.2;
		x.display(80,100,true);		
	}

}
