package first.lesson.intro;

public class Firstclass  
{

	public static void main(String[] args)
	{
     int Arr1[] = {5,10,15,16,20,22};
//     int Arr2[] = {3,7,10,16,22,25};
//       int Arr3[] = new int[6];
//       int x = 0;
     
	 for (int i = 0; i < Arr1.length; i = i + 1) 
		 {
		 	if (Arr1[i]%2 == 0) 
		 	{
		 		Arr1[i] = 0; 
				
		 	}
		 	System.out.println(Arr1[i]);
		 }
	 
//	 for(int f=0; f < Arr3.length; f = f +1) 
//		 {
//			 System.out.println(Arr3[f]);
//		 }
	}
}
