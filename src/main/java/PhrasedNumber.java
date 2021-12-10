import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


enum PhrasedNumber {

    first, second, third, fourth, fifth, sixth, seventh;


    static List<String> enumNames = Stream.of(PhrasedNumber.values())
            .map(PhrasedNumber::name)
            .collect(Collectors.toList());


}




