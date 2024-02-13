
public class stringsNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// with split command with delimeter
		String s = "my name is venkatesh";
		String[] splitStr = s.split(" ");
		System.out.println(splitStr[0]);
		String[] splitStr1 = s.split("is");
		System.out.println(splitStr1[1]);
		
		//reverse the string
		for (int m=s.length()-1;m>=0;m--)
		{
			System.out.println(s.charAt(m));
		}
		
	}

}
