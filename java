����1949��10��1�վ�����������



import java.util.Date;

public class date {
	public static void main(String[] args) {
		Date today=new Date();
		Date guoqing=new Date(49, 9, 1);
		long xz=today.getTime();
		long gq=guoqing.getTime();
		int days=(int)((xz-gq)/(1000*60*60*24));
		System.out.println(days);
	}
}
