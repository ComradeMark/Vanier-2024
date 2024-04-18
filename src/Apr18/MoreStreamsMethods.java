package Apr18;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreStreamsMethods {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 3, 5, 6, 8);
        boolean allEven = intList.stream().allMatch(i -> i%2 ==0);
        boolean oneEven = intList.stream().anyMatch(i->i%2 ==0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i%3 ==0);

        //Map method returns a new stream by mapping each element in the stream to a new element
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x-> x>5).collect(Collectors.toList());
        System.out.println(collect);


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

        Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println); //prints a1
        Arrays.stream(new int[]{1, 2, 3}).map(n->2*n+1).average().ifPresent(System.out::println);


        Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(5).forEach(System.out::println);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        Collections.sort(ll);

    }
}
