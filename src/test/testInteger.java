package test;

public class testInteger {
	public static void main(String[] args)
	// main()�Ĳ�����string���͵����飬������Ϊ������ʱ��Ҫת�������͡�
	{
		int w = new Integer(args[0]).intValue();
		int h = Integer.parseInt(args[1]);
		// int h=Integer.valueOf(args[1]).intValue();
		// ����Ϊ���ֽ��ַ���ת�������εķ�����
		for (int i = 0; i < h; i++) {
			StringBuffer sb = new StringBuffer(); // ʹ��stringbuffer������Ϊ���ǿ�׷�ӵġ�
			for (int j = 0; j < w; j++) {
				sb.append('*');
			}
			System.out.println(sb.toString()); // �ڴ�ӡ֮ǰ��Ҫ��stringbufferת��Ϊstring���͡�
		}
	}
}