package handson;

	interface Addable{  
	    int add(int a,int b);  
	}  
	  
	public class LambfaExample2{  
	    public static void main(String[] args) {  
	          
	    	Addable ad1=(a,b)->(a+b);  
	        System.out.println(ad1.add(35,65));  
	           
	        Addable ad2=(int a,int b)->(a+b);  
	        System.out.println(ad2.add(205,403));  
	    }  
	}  