package p95;

import java.util.ArrayList;
import java.util.List;

import p94.GenericStack;

public class GenericStackUtilTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("Groovy");
		GenericStack<String> gstack = GenericStackUtil.as(strList);

	}

}
