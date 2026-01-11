package com.example.p10_spring_di_with_mutli_same_class_types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.p10_spring_di_with_mutli_same_class_types.utils.ClassNameFinder;

@SpringBootTest
class P10SpringDiWithMutliSameClassTypesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testClassNameFinder() {
		String test = "opt.local.finder";

		assertEquals("finder", ClassNameFinder.toClassName(test));
	}

}
