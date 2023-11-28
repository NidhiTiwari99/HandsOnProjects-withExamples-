package handson;

import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
        StringJoiner sj = new StringJoiner(",", "[", "]");
            
        sj.add("Rahul");  
        sj.add("Raju");  
        sj.add("Peter");  
        sj.add("Raheem");  
                  
        System.out.println(sj);  
    }  
}  