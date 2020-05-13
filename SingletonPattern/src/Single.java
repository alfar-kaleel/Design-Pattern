
public class Single {
	
	private static volatile int number;
	private static volatile Single obj;
	
	private Single() {
		
		if(obj != null ) {
			
			throw new RuntimeException("Please use method in this class in order to create instance");
		}
		
		
		
		
	}
	
	
	public static Single getobj() {
		
		if (obj == null) {
			
			synchronized(Single.class) {
				
				if(obj == null) {
					
					obj = new Single();
					
				}
				
			}
			
			
		}
		
		return obj;
	}

	
	public static int getint() {
		
		if(number == 0) {
			
			synchronized(Single.class) {
				
				if(number == 0) {
					
					for(int i = 0;i<100000;i++) {
						
						number = i;
						//doing something to elapse time
						
					}
					
					
				}
				
			}
			
		}
		
		
		return number;
		
	}
	
	
	
	
}
