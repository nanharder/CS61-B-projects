/** Performs some basic Array list tests. */
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void TestAdd() {
        ArrayDeque<Integer> input = new ArrayDeque<>();
        for (int i = 0; i < 100; i += 1) {
            input.addLast(i);
        }
        int result = input.size();
        int result2 = input.get(0);
        assertEquals(100, result);
        assertEquals(0, result2);
    }

    public void TestRemove() {
        ArrayDeque<Integer> input = new ArrayDeque<>();
        for (int i = 0; i < 16; i += 1) {
            input.addLast(i);
        }
        for (int i = 0; i < 7; i += 1) {
            input.removeLast();
        }
        for (int i = 0; i < 7; i += 1) {
            input.removeFirst();
        }
        int result = input.size();
        int result2 = input.get(0);
        assertEquals(2, result);
        assertEquals(8, result2);
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> input = new ArrayDeque<>();
        input.addFirst(0);
        input.isEmpty();
        input.addFirst(2);
        input.isEmpty();
        input.addFirst(4);
        input.addFirst(5);
        input.addFirst(6);
        input.addFirst(7);
        input.addFirst(8);
        input.removeLast();
    }

}
