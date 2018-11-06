package test;
/*
 * ceshi
 */
public class readline {
	public static void main(String args[]) {
		String strInfo = null;
		int pos = 0;
		byte[] buf = new byte[1024];// 定义一个数组，存放换行前的各个字符
		int ch = 0; // 存放读入的字符
		System.out.println("Please input a string:");
		while (true) {
			try {
				ch = System.in.read(); // 该方法每次读入一个字节的内容到ch变量中。
			} catch (Exception e) {
			}
			switch (ch) {
			case '\r': // 回车时，不进行处理
				break;
			case '\n': // 换行时，将数组总的内容放进字符串中
				strInfo = new String(buf, 0, pos); // 该方法将数组中从第0个开始，到第pos个结束存入字符串。
				if (strInfo.equals("bye")) // 如果该字符串内容为bye，则退出程序。
				{
					return;
				} else // 如果不为bye，则输出，并且竟pos置为0，准备下次存入。
				{
					System.out.println(strInfo);
					pos = 0;
					break;
				}
			default:
				buf[pos++] = (byte) ch; // 如果不是回车，换行，则将读取的数据存入数组中。
			}
		}
		
	}
}
