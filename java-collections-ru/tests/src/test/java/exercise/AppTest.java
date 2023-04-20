package exercise;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        var count1 = 2;

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        numbers2.add(3);
        numbers2.add(10);
        var count2 = 8;

        List <Integer> list1 = App.take(numbers1, count1);
        List <Integer> list2 = App.take(numbers2, count2);

        Assertions.assertEquals(list1.get(0), 1);
        Assertions.assertEquals(list1.get(1), 2);
        Assertions.assertEquals(list1.size(), 2);

        Assertions.assertEquals(list2.get(0), 7);
        Assertions.assertEquals(list2.get(1), 3);
        Assertions.assertEquals(list2.get(2), 10);
        Assertions.assertEquals(list2.size(), 3);
        // END
    }
}
