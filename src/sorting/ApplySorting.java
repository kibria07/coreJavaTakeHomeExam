package sorting;

public class ApplySorting {
	
	public static void main(String args[]){
		int [] array = new int[]{90,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
	int temp;
	
	//==========================bubblesorting =======================================================
	/*for(int j=0; j < array.length;j++){///running through the loop
	for(int i=0; i < array.length-1;i++){ ////running through the index
		//int array[]={5,2,3,6,7,9,4,5}
		if(array[i]> array[i+1]){///ascending order // if 5 > 2 then 
			temp=array[i+1];  //swap position , so 5 goes to 2'th position
			
			
			array[i+1]=array[i]; //swap put 5 into 2'th place
			array[i]=temp;//store 5'th place into storage temp
		}
	}}
	for(int k = 0; k <array.length; k++)
		  System.out.print(array[k]+"  ");*/
	
	
	///============================================================
	//insertion sorting 
	
	for (int  i = 1; i < array.length; i++){
		  int j = i;
		  int B = array[i];
		  while ((j > 0) && (array[j-1] > B)){
		  array[j] = array[j-1];
		  j--;
		  }
		  array[j] = B;
		  }
	for(int k = 0; k <array.length; k++)
		  System.out.print(array[k]+"  ");
	

}}


