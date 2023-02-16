package core;

class Data{
	static {
		System.out.println("this is static block inside data class");
	}
	int rollno;
	String name;
	double per;
	static String cname = "TOPS";
	Data(int rollno,String name, double per){
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	public void showData() {
		System.out.println("roll no : "+rollno+" name : "+name+" per : "+per+ " cname : "+cname);
	}
	public static void name() {
		System.out.println("name mehtod inside data class");
	}
}
public class StaticKeuword {
	static {
		System.out.println("this is static block inside main class");
	}
	public static void main(String[] args) {
		Data d =new Data(1,"c",45.4);
		d.showData();
		Data d1 =new Data(2,"c++",65.4);
		d1.showData();
		Data d2 =new Data(3,"java",75.4);
		d2.showData();
		Data d3 =new Data(4,"python",65.4);
		d3.showData();
		Data.name();
	}
}
