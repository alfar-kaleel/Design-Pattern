
public class Testingsingle {
	
	public static void main(String []args) {
		
	
	long start;
	long end;
	
	start = System.currentTimeMillis();
	
	Single obj	= Single.getobj();
	int num = obj.getint();
	
	end = System.currentTimeMillis();
	
	System.out.println("Returned number : "+ num);
	System.out.println("Time taken for first object : " + (end-start));

	
	
	
   start = System.currentTimeMillis();
	
	Single obj1	= Single.getobj();
	int num1 = obj.getint();
	
     end = System.currentTimeMillis();
	
 	System.out.println("Returned number : "+ num1);
	System.out.println("Time taken for second object : " + (end-start));
	
	
	//System.out.println(single);
	
	//System.out.println(single1);
		
	}
	

}
