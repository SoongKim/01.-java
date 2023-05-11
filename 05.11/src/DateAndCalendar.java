import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import com.sun.tools.javac.parser.ReferenceParser.ParseException;

public class DateAndCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 01. 특정 날짜의 년, 월, 일, 요일 구하기
		
		// 01-1. Java 8 이후 버전에서의 오늘 날짜 구하기
		LocalDate now = LocalDate.now();
			//LocalDate 메소드를 사용한다.
		System.out.println(now);
		
		// 01-2. Java 8 이전 버전에서의 오늘 날짜 구하기
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
			//SimpleDataFormat 메소드를 사용.
		
		String nowTime1 = sdf1.format(new Date());
		System.out.println(nowTime1);
		
		String date1 = "2020-12-30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf2.parse(date1);
			System.out.println(date);
			SimpleDateFormat sdf3 = new SimpleDateFormat("E");
			System.out.println(sdf3.format(date));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}