import java.util.Scanner;

public class IT26102348Lab8Q1B{
   public static void main(String[] args){
   
     Scanner NumScannr = new Scanner(System.in);
	   int[] myArray = new int[5];
	   int[] EvenArray = new int [5];
	   
	  System.out.println("Enter 5 numbers :");
	  
	  for ( int i =0; i < myArray.length; i++ ) {
	   System.out.print("Enter number " + (i + 1 ) + " : " );
	       myArray [i] = NumScannr.nextInt();
	  
	  }
	     System.out.println();
         System.out.println("MyArray contents :" ); 
		 
		for(int i = 0 ; i < myArray.length  ;  i++){
		
		 System.out.print(myArray[i] + " ");
		 
		}
      
	  int evencount = 0;
	  for ( int i =0; i < myArray.length; i++ ) {
	  if (myArray[i] % 2 == 0 ){
		  EvenArray[evencount] = myArray[i];
		  evencount++ ;
	   }
	   
	 }
	   System.out.println();
	    System.out.println("EvenArray Contents :" ); 
		 
		for(int i= 0 ;  i < EvenArray.length  ; i++){
		
		 System.out.print(EvenArray[i] + " ");
        
        }

   }
   
}