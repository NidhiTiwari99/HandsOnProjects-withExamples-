package handson;


@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExample {  
    public static void main(String[] args) {  
        int width=10;  
           
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  