package type2.client;

import type2.api8.DefaultFoo;
import type2.api8.Foo;

public class Apiclient {

	public static void main(String[] args) {
		Foo foo = new DefaultFoo("Hello Foo!");
				
		System.out.println(foo.say());

	}

}
