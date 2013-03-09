import static org.junit.Assert.*;
import me.hardtack.format.korean.KoreanString;

public class Test {

	@org.junit.Test
	public void test() {
		assertEquals("����� �Դ´�", KoreanString.format("%�� �Դ´�", "���"));
		assertEquals("��⸦ �Դ´�", KoreanString.format("%�� �Դ´�", "���"));

		assertEquals("����� ���ִ�", KoreanString.format("%�� ���ִ�", "���"));
		assertEquals("��Ⱑ ���ִ�", KoreanString.format("%�� ���ִ�", "���"));
		
		assertEquals("����� ���ִ�", KoreanString.format("%�� ���ִ�", "���"));
		assertEquals("���� ���ִ�", KoreanString.format("%�� ���ִ�", "���"));

		assertEquals("2��° �ٿ� ���� ö���� ���ڸ� 0032�� �����ߴ�", KoreanString.format(
				"%d��° �ٿ� ���� %�� %�� %04d�� �����ߴ�", 2, "ö��", "����", 32));

		assertEquals("ö���� 2��° �ٿ� �ɾ� 2���ڰ� �ƴ�",
				KoreanString.format("%2$�� %1$d��° �ٿ� �ɾ� %1$d���ڰ� �ƴ�", 2, "ö��"));
	}

}
