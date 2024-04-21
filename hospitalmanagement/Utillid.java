package hospitalmanagement;

public class Utillid {
	static int pId=1000;
	static int dId=2000;
	static String strP="P";
	static String strD="D";
	static String strA="A";
	static int aId=100;
	
	public static  String getpId() {
		
		return strP+pId++;
		
	}
	public static String getdId() {
		
		return strD+dId++;
	}
	
	public static String getaId() {
	
		return strA+aId++;
	}

}
