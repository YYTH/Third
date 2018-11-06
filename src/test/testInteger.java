package test;

public class testInteger {
	public static void main(String[] args)
	// main()的参数是string类型的数组，用来做为长，宽时，要转换成整型。
	{
		int w = new Integer(args[0]).intValue();
		int h = Integer.parseInt(args[1]);
		// int h=Integer.valueOf(args[1]).intValue();
		// 以上为三种将字符串转换成整形的方法。
		for (int i = 0; i < h; i++) {
			StringBuffer sb = new StringBuffer(); // 使用stringbuffer，是因为它是可追加的。
			for (int j = 0; j < w; j++) {
				sb.append('*');
			}
			System.out.println(sb.toString()); // 在打印之前，要将stringbuffer转化为string类型。
		}
	}
}