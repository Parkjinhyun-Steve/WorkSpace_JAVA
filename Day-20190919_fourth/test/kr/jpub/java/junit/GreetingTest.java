package kr.jpub.java.junit;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreetingTest {
	private Greeting target = new Greeting();
	@Test
	public void getMessage_��ħ�λ�() {
		String message = this.target.getMessage(5);
		assertThat(message, is("���� ��ħ�Դϴ�."));

	}

}
