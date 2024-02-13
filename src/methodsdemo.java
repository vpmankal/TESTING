
public class methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsdemo md = new methodsdemo();
		md.getData();
		methodsdemo md1 = new methodsdemo();		
		String retStr = md1.getData1();
		System.out.println(retStr);	
		
		methoddemo2 md2object = new methoddemo2();
		md2object.getuserData();
		String retmd2 = md2object.getuserData();
		System.out.println(retmd2);
		
		getuserData2();
		String ss = getuserData2();
		//SYstem.out.println();
		System.out.println(ss);
		
	}

	//mthod should be created outside of main, as code in main for execution.
	//method can be kept outside main and called in main for execution
	//mr=ethod of the class methodDemo but can be used by other classes also
	//public - access modifier, void=return type canbe String,int,void=nothing means no return
	
	private static void getuserData1() {
		// TODO Auto-generated method stub
		System.out.println("hello latha getuserData1");
		//turn  "getuserdata1";
	}
	private static String getuserData2() {
		// TODO Auto-generated method stub
		System.out.println("hello latha getuserData2");
		return  "getuserdata2";
	}
	public void getData() {
	System.out.println("hello padma");	
	}
	public String getData1() {
	System.out.println("hello latha");
	return "return raji";
	}
}
