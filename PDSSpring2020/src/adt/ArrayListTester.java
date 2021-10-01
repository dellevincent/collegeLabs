package adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayListTester {

	@Test
	void testIsEmpty() {
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i=0; i < 10000; i++) {
			list1.add(i);
			list2.add(i);
		}
		
		while (!list1.isEmpty() && !list2.isEmpty()) {
			list1.remove(0);
			list2.remove(0);
		}
		
		assertEquals(list1.isEmpty(), list2.isEmpty());
	}

	@Test
	void testAddAtAnIndexAndGet() {
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
	
		for (int i=0; i < 10000; i++) {
			list1.add(i, i);
			list2.add(i,i);
			
		}
		
		for (int i=0; i< list1.size(); i++) {
			assertEquals(list1.get(i), list2.get(i));
		}
	}
	
	@Test
	void testClearContainsSize() {
		
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for(int i=0; i < 10000; i++) {
			list1.add(i);
			list2.add(i);
			assertEquals(list1.contains(i), true);
			assertEquals(list2.contains(i), true);
		}
		
		list1.clear();
		list2.clear();
		
		assertEquals(list1.size(), 0);
		assertEquals(list2.size(), 0);
		
	}
	
	@Test
	void testGetIndexOf() {
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i=0; i< 10000; i++) {
			list1.add(i);
			list2.add(i);
			assertEquals(list1.contains(i), list2.contains(i));
			assertEquals(list1.indexOf(i), list2.indexOf(i));
			assertEquals(list1.lastIndexOf(i), list2.lastIndexOf(i));
		}
	
	}
	
	@Test
	void testRemoveSet() {
		java.util.List<Integer> list1 = new java.util.ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i=0; i < 1000; i++) {
			list1.add(i);
			list2.add(i);
			list1.add(i);
			list2.add(i);
			list1.remove(i);
			list2.remove(i);
			list1.add(i);
			list2.add(i);
			list1.remove(new Integer(i));
			list2.remove(new Integer(i));
			list1.set(i, i);
			list2.set(i, i);
		}
		
		assertEquals(list1.size(), list2.size());
	}
}
