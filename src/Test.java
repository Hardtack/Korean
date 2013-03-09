import static org.junit.Assert.*;
import me.hardtack.format.korean.KoreanString;

public class Test {

	@org.junit.Test
	public void test() {
		assertEquals("라면을 먹는다", KoreanString.format("%을 먹는다", "라면"));
		assertEquals("고기를 먹는다", KoreanString.format("%을 먹는다", "고기"));

		assertEquals("라면이 맛있다", KoreanString.format("%이 맛있다", "라면"));
		assertEquals("고기가 맛있다", KoreanString.format("%이 맛있다", "고기"));
		
		assertEquals("라면은 맛있다", KoreanString.format("%은 맛있다", "라면"));
		assertEquals("고기는 맛있다", KoreanString.format("%은 맛있다", "고기"));

		assertEquals("2번째 줄에 앉은 철수가 과자를 0032개 구입했다", KoreanString.format(
				"%d번째 줄에 앉은 %이 %을 %04d개 구입했다", 2, "철수", "과자", 32));

		assertEquals("철수가 2번째 줄에 앉아 2인자가 됐다",
				KoreanString.format("%2$이 %1$d번째 줄에 앉아 %1$d인자가 됐다", 2, "철수"));
	}

}
