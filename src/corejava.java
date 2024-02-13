import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myN = 5;
		char chrr = 'c';
		String strc = "java";
		double db = 12.55;
		boolean bln = false;
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 3;
		arr1[2] = 4;
		arr1[3] = 5;
		arr1[4] = 11;//
		//int[] arr2 = {1,2,3,4,5};
		for(int i=0; i< arr1.length; i++)
		{
			System.out.println( arr1[i] + "array1 val for "+i);
		}
		String[] name = {"vp","padma","lakshmi"};
		for(int i=0; i< name.length;i++)
		{
			System.out.println( name[i] + "name val for "+i);
		}
		
		//extended for loop
		for ( String v: name)
		{
			System.out.println( v);
		}	 
		System.out.println( myN + "integere val");
		System.out.println( chrr + "char val");
		System.out.println( strc + "string val");
		System.out.println( db + "double val");
		System.out.println( bln + "blen val");
		System.out.println( arr1[2] + "array val");
		
		//if else
		int[] arr3 = {1,2,4,6,7,8,9,10};
		for (int j=0; j<arr3.length;j++)
		{
			if (arr3[j] % 2 == 0)
			{
				System.out.println( arr3[j] + "divided value");
			}
			else
			{
				System.out.println( arr3[j] + "not divisible by 2");
			}
		}
		
		// arrayList string
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("vpm");
		a.add("padma");
		a.add("lakshmi");
		a.add("kiran");
		a.add("latha");
		
		System.out.println( a.get(1) + "index value 1");
		
		for (int k=0;k<a.size();k++)
		{
			System.out.println( a.get(k) + "index value "+k+"in loop");
		}
		
		for ( String val:a)
		{
			System.out.println( val + "dex extended for loop");
		}
		
		//check if padma keyword contains in the arraylist - output false as pafdma string not there
				System.out.println(a.contains("pafdma"));
		//check if padma keyword contains in the arraylist - output true as pafdma string not there
		System.out.println(a.contains("padma"));
		
		// List of arrays or Array list with datatype when we define a variable
		//return type is List
		
		List nameArrayList = Arrays.asList("padma");
				System.out.println(nameArrayList.contains("padma"));
				
		
				//string literal & new allocation using new keyword
		//what is string in java? - its an object represent sequence of chars
		//two ways u can define - string literals & new memory operatorwa
				// way1y
				String str1 = "string declaration";
				String Str2 = new String("using new");
				

	}

}
