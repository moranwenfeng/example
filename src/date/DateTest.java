package date;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
public class DateTest{
 
	public static void main(String[] args) throws ParseException {
		Calendar now = Calendar.getInstance();
		System.out.println("��: " + now.get(Calendar.YEAR));
		System.out.println("��: " + (now.get(Calendar.MONTH) + 1) + "");
		System.out.println("��: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ: " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("��: " + now.get(Calendar.MINUTE));
		System.out.println("��: " + now.get(Calendar.SECOND));
		System.out.println("��ǰʱ���������" + now.getTimeInMillis());
		System.out.println(now.getTime());
 
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(d);
		System.out.println("��ʽ��������ڣ�" + dateNowStr);
		
	}
}
