package jokerDelimited;

import java.util.ArrayList;
import java.util.List;

import jokerDelimitedEntities.Circle;
import jokerDelimitedEntities.Rectangle;
import jokerDelimitedEntities.Shape;

public class Program {
 
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape > list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
	/* alternative code = for copy ->
	 * 
	 * List<Integer> myInts = Array.asList(1, 2, 3, 4);
	 * List<Double> myDoubles = Array.asList(3.14, 6.28);
	 * List<Object> myObjs = new ArrayList<Object>();
	 * 
	 * copy(myInts, myObjs);
	 * printList(myObjs);
	 * copy(myDoubles, myObjs);
	 * printList(myObjs);
	 * } 
	 * public static void copy(List<? extends Number> source, List<? super Number> destiny){
	 * 	for(Number number : source){
	 * 		destiny.add(number);
	 * 	}
	 * }
	 * public static void printList(List<?> list){
	 * 	for(Object obj : list){
	 * 		System.out.print(obj + " ");
	 * 	}
	 * 	System.out.print();
	 * }
	 * 
	 * 
	 */
}
