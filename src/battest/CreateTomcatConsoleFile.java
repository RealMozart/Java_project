package battest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateTomcatConsoleFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 开始执行
		 * 检查console.txt文件是否存在
		 * 1.存在，将旧的console.txt重命名后创建新的
		 * 		重命名规则为console+当前时间戳
		 * 2.不存在在创建console.txt
		 * */
		File oldfile = new File("D:\\workspace\\console\\console.txt");
		if(oldfile.exists()&&oldfile.isFile()){//存在并且是文件
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");//设置日期格式
			String time = df.format(new Date());
			File newfile = new File("D:\\workspace\\console\\console_"+time+".txt");
			oldfile.renameTo(newfile); 
			//System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		}
	}
	

}
