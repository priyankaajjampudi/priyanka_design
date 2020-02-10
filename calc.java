package demo;
import java.util.Scanner;

class Addition { 
    
    double sum = 0; 
      
    public double addTwoNum(double a, double b){ 
          
        sum = a + b; 
          
        return sum;  
    } 
      
} 
class  Subract{ 
    
    double diff = 0; 
      
    public double subTwoNum(double a, double b){ 
          
        diff= a - b; 
          
        return diff;  
    } 
      
} 
          
class Multiplication { 
    
    double mul = 0; 
      
    public double mulTwoNum(double a, double b){ 
          
        mul = a * b; 
        return mul; 
    } 
      
} 
class Division { 
    
    double div= 0; 
      
    public double divTwoNum(double a, double b){ 
          
        div = a / b; 
           
        return div;  
    } 
      
} 
public class calc{

    public static void main(String[] args) {

    	double num1, num2;
    	String s1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        double output;
        Addition add = new Addition(); 
        Subract  sub = new Subract(); 
        Multiplication mul = new Multiplication(); 
        Division div = new Division(); 

        while(true)
        {
        	
        	
        switch(operator)
        {
            case '+':output=add.addTwoNum(num1, num2);
                break;

            case '-':
            	output=sub.subTwoNum(num1, num2);
                break;

            case '*':
            	output=mul.mulTwoNum(num1, num2);
                break;

            case '/':
            	output=div.divTwoNum(num1, num2);
                break;

            default:
                System.out.println("You have entered wrong operator");
                return;
        }
        System.out.print("if user want to continue print yes");
        scanner.nextLine();
        s1=scanner.nextLine();
        if(s1.contentEquals("yes"))
        {   
            System.out.println(output);
        	num1=output;
            System.out.print("Enter second number:");
            num2 = scanner.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
             operator = scanner.next().charAt(0);

        }
        else {
                
        System.out.println(s1+ " "+output);
        break;
             }
    }
}
}
