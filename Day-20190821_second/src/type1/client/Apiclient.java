package type1.client;

import type1.api.DefaultFoo;
import type1.api.Foo;

public class Apiclient {

	public static void main(String[] args) {
		Foo foo = new DefaultFoo("Hello foo!");
		
		System.out.println(foo.say());

	}

}