package test;
/*
 * ceshi
 */
public class readline {
	public static void main(String args[]) {
		String strInfo = null;
		int pos = 0;
		byte[] buf = new byte[1024];// ����һ�����飬��Ż���ǰ�ĸ����ַ�
		int ch = 0; // ��Ŷ�����ַ�
		System.out.println("Please input a string:");
		while (true) {
			try {
				ch = System.in.read(); // �÷���ÿ�ζ���һ���ֽڵ����ݵ�ch�����С�
			} catch (Exception e) {
			}
			switch (ch) {
			case '\r': // �س�ʱ�������д���
				break;
			case '\n': // ����ʱ���������ܵ����ݷŽ��ַ�����
				strInfo = new String(buf, 0, pos); // �÷����������дӵ�0����ʼ������pos�����������ַ�����
				if (strInfo.equals("bye")) // ������ַ�������Ϊbye�����˳�����
				{
					return;
				} else // �����Ϊbye������������Ҿ�pos��Ϊ0��׼���´δ��롣
				{
					System.out.println(strInfo);
					pos = 0;
					break;
				}
			default:
				buf[pos++] = (byte) ch; // ������ǻس������У��򽫶�ȡ�����ݴ��������С�
			}
		}
		
	}
}
