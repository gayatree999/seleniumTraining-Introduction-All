package gayatri;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt= new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdt.format(dt));
		System.out.println(sd.format(dt));
		System.out.println(dt.toString());

	}

}
