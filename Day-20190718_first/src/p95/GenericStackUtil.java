package p95;

import java.util.List;

import p94.GenericStack;

public class GenericStackUtil {
	public static <T> GenericStack<T> as(List<T> list) {
		GenericStack <T> stack = new GenericStack<>();
		list.forEach(stack::push);
		return stack;
			
	}

}
