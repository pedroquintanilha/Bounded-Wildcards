package services;

import java.util.List;

public class ListService {
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		for(Number element : source) {
			destiny.add(element);
		}
	}
	
	public static void print(List<?> list) {
		
		for(Object element: list) {
			System.out.print(element + " ");
		}
	}

}
