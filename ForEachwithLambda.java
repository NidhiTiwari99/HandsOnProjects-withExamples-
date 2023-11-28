package handson;

	import java.util.*;  
	public class ForEachwithLambda{  
	    public static void main(String[] args) {  
	          
	        List<String> list=new ArrayList<String>();  
	        list.add("Nidhi");  
	        list.add("Vidhi");  
	        list.add("Sonam");  
	        list.add("Shivam");  
	          
	        list.forEach(  
	            (a)->System.out.println(a)  
	        );  
	    }  
	}  
