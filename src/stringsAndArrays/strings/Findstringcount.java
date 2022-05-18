package stringsAndArrays.strings;

public class Findstringcount {
	String s1 = "iamdeepthi.iamfromap.iamatbgl";

	public void findstringcount() {

		int count = 0, fromindex = 0;
		String strfind = "am";
		fromindex=s1.indexOf(strfind, fromindex);
		//System.out.println("found at index" + fromindex);
		while ((fromindex = s1.indexOf(strfind, fromindex)) != -1) {

			System.out.println("found at index" + fromindex);
			count++;
			fromindex++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Findstringcount a1 = new Findstringcount();
		a1.findstringcount();

	}

}
