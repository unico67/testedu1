package streamexam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndIterator {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "D");

		// 스트림 사용(X)
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		System.out.println("-------------------------------");
		// 스트림 사용(O)
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
