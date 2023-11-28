package handson;

	import java.util.ArrayList;  
	import java.util.List;  
	import java.util.stream.Stream;   
	
	class Mobile{  
	    int id;  
	    String name;  
	    float price;  
	    public Mobile(int id, String name, float price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	public class LambdaExamplewithFilter{  
	    public static void main(String[] args) {  
	        List<Mobile> list=new ArrayList<Mobile>();  
	        list.add(new Mobile(1,"Samsung A5",17000f));  
	        list.add(new Mobile(3,"Iphone 6S",65000f));  
	        list.add(new Mobile(2,"Sony Xperia",25000f));  
	        list.add(new Mobile(4,"Nokia Lumia",15000f));  
	        list.add(new Mobile(5,"Redmi4 ",26000f));  
	        list.add(new Mobile(6,"Lenevo Vibe",19000f));  
	          
	        Stream<Mobile> filtered_data = list.stream().filter(p -> p.price > 20000);  
	          
	        filtered_data.forEach(  
	        		Mobile -> System.out.println(Mobile.name+": "+Mobile.price)  
	        );  
	    }  
	}  
