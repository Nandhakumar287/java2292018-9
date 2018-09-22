import java.io.*;
import java.util.*;
  public class SumK{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any Integer:");
     int a=sc.nextInt();
     int fact=0;
     for(int i=0;i<a;i++){
     fact=fact+i;
     }
     System.out.println("ANS: "+fact);
     }
   }  
