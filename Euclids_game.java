/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclids_game;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class Euclids_game {
public static int play(int a,int b){
    if(b<=0){
        return 0;
        
    }
    if((int)a/b>1){
        return 1;
    }
    return play(b,a-b)+1;
    
}
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int first=Integer.parseInt(sc.nextLine());
        int second=Integer.parseInt(sc.nextLine());
        // to swap betwen 2 variables
        int x=0;
        if(first<second){
            x=first;
            first=second;
            second=x;
        }
        int count=play(first,second);
       if(count%2!=0){
           System.out.println(" player1  win");
       }        
       else{
           System.out.println(" player2 win");
       }
        
        
        
    }
    
}
