/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//the edited version.
package projectone;
import java.util.Scanner;

/**
 *
 * @author Neeraj
 * 
 */
public class ArrayNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input1=new Scanner(System.in);
    String word=input1.next();
    System.out.println("Enter a word");
   
    
    
    char[] name=new char[word.length()];
    
    for(int i=0;i<word.length();i++){
    
      name[i]=word.charAt(i);
}
    for(int i=word.length();i>=0;i--){
    
    System.out.println(name[i]);
    }
    

    }
}
