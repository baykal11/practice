import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //

        List<Integer> nums = Arrays.asList(14,463,234,4,357,45,235,46,3);

        int max = nums.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(max);



        
    }
}
