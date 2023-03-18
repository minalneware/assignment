import java.util.Scanner;
public class palindrome 
{  
   public static void main(String[] args) 
   {  
       //Take input from the user
       //Create instance of the Scanner class
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num=sc.nextInt();
       int r,pal=0;
       int temp=num;    
       while(num>0)
       {    
       r=num%10;    
       pal=(pal*10)+r;    
       num=num/10;    
       }    
        if(temp==pal)    
        System.out.println("The entered number  is a palindrome number ");    
        else    
        System.out.println("The entered number is not a palindrome");    
  }  
} 
