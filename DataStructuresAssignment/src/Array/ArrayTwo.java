package Array;

class ArrayOne {
	
	    public static int Array1[] = {3,4,5,6,7};
	      public void ArrayIntersect() {
	      System.out.println("Common items in these Array");
	     
	      
	   }
}

public class ArrayTwo extends ArrayOne {
	public static int Array2[] = {6,7,8,9,10};
  public static void main(String[] args)  {
	 
	  ArrayTwo intersect = new ArrayTwo();
   intersect.ArrayIntersect();
   for(int i = 0; i<Array1.length; i++ ) 
       for(int j = 0; j<Array2.length; j++) 
          if(Array1[i]==Array2[j]) 
             System.out.println(Array2[j]);
  
  }
}
