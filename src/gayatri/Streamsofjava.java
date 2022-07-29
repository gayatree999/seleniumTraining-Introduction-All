package gayatri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streamsofjava {

	//count number of names starting with char A in a list
	//@Test
	public void regular() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Aabhi");
	names.add("Don");
	names.add("Alekshya");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	for (int i=0; i<names.size();i++) {
		String actual = names.get(i);
		if(actual.startsWith("A")) {
			count++;
		}
	}
	System.out.println(count);	
	}
	//@Test
		public void streamFilter()
	
		{
			ArrayList<String> names= new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
					{
						s.startsWith("A");
						return true;
					}).count();
			System.out.println(d);
			//print all the names of ArrayList
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			
			
			
		}
	//@Test
	public void streamMap() {
		//print which name ends with a with uppercase
		Stream.of("Azbhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		List<String> names = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));;
	}
	//@Test
	public void streamMerge() {
		ArrayList<String> names1= new ArrayList<String>();
		names1.add("man");
		names1.add("Don");
		names1.add("women");
		
		List<String> names2 = Arrays.asList("Abhijeett","Alekhya","Adam","Rama");
		//Merging 2 different lists
		Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//check if Adam id present in newStream
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abhijeett","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values =Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array- 3rd index
		values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

	}
