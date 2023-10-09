package OopsConcept;

public class ArrayEx {

	public static void main(String[] args) {
	  int removeindex=3;
	  int num[]= new int[6];
	  num[0]=10;
	  num[1]=20;
	  num[2]=30;
	  num[3]=40;
	  num[4]=50;
	  num[5]=60;
	 
	  int num01[]=new int[5];
	  // : for each
	  for(int i:num) {
		  System.out.println(i);
	  }
       System.out.println("   ");
       for(int i=0,k=0; i<num.length;i++ ) {
    	   if(i == removeindex) {
    		   continue;
    	   }
    	   num01[k]=num[i];
    	   k++;
       }
       for(int i : num01) {
    	   System.out.println(i);
       }
}
}