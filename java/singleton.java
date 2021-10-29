package java2;




class SingletonExample {

	   // private field that refers to the object
	   private static SingletonExample singleObject;
	                                              
	   private SingletonExample() {
	      // constructor of the SingletonExample class
	   }

	   public static SingletonExample getInstance() {
	     if(singleObject==null) {
	    	 singleObject=new SingletonExample();
	     }
	     return singleObject;
	   }
	}