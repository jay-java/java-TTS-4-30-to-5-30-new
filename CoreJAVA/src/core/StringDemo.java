package core;


//StringBuffer/StringBuilder
public class StringDemo {
	public static void main(String[] args) {
		String s = "TOPS";
		String s1 = "tops";
//		System.out.println(s.length());
//		System.out.println(s.isBlank());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s.contains("PS"));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.replace('T', 'S'));
		System.out.println(s.trim());
	}
}
