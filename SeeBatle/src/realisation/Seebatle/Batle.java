package realisation.Seebatle;
import java.util.Scanner;
import java.awt.Color;
import java.awt.color.*;
public class Batle {

	public static void main(String[] args) {

   char [][] field=new char[10][10];
   for(int i=0;i<10;i++) {
	   for(int j=0;j<10;j++) {
		   field[i][j]='0';
	   }
   }
   Scanner in=new Scanner(System.in);
   int count=0;
   
   do {
   System.out.println("Create your Ships:\n1. One deck Ships: 4.\n2. Two deck Ship: 3.\n3. Three deck Ship: 2.\n4. Four deck Ship: 1");
   
   for(int i=0;i<10;i++) {
	   for(int j=0;j<10;j++) {
		   	  
		  System.out.print(field[i][j]+" "); 
	   }
	   System.out.println();
   }
   System.out.println();
   for(int i=0;i<10;i++) {
	   for(int j=0;j<10;j++) {
		   	  
		  System.out.print(field[i][j]+" "); 
	   }
	   System.out.println();
   }
   int x=0,x1=0,y=0,y1=0;
   System.out.println("Enter an x and y value for one deck ship");
   x=in.nextInt();
   y=in.nextInt();
   Ship one_deck=new Ship(x,y);
   for(int i=0;i<10;i++) {
	   
	   for(int j=0;j<10;j++) {
		  if(one_deck.arrx[0]==i&&one_deck.arrx[1]==j&&field[i][j]=='0') {
			  
			   for (int k=one_deck.arrx[0];i<one_deck.arrx[0])
			   field[i][j]='*';
			   count++;
		   }
		  
	   }
	  }
   
   
   }while(count!=4);
   
   
	}
	
	

	public static void FielShip() {
		
	}
}
class Ship{
//	int x;
//	int y;
//	int x1;
//	int y1;
	int []arrx=new int [4];
	public Ship() {
		
	}
	public Ship(int x,int y) {
		arrx[0]=x;
		arrx[1]=y;
	}
	public Ship(int x,int y, int x1,int y1) {
		arrx[0]=x;
		arrx[1]=y;
		arrx[2]=x1;
		arrx[3]=y1;
	}
	
}
