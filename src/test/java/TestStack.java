import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

public class TestStack {

    // stack.push - dodawanie
    // stack.pop - pobiera i usuwa
    // stack.peek - pobiera i zostawia

    Stack<Object> stack;


    @Nested
    class WhenNew {

        @BeforeEach
        public void initStack() {
            stack = new Stack<>();
        }

        @Test
        public void whenNewIsEmptyTest() {
            assertTrue(stack.isEmpty());
        }

        @Test
        public void whenNewPoppedTest() {
            assertThrows(EmptyStackException.class, stack::pop);
        }

        @Test
        public void whenNewPeekedTest() {
            assertThrows(EmptyStackException.class, stack::peek);
        }
    }

    @Nested
    class AfterPushing {

        private String item = "An item";

        @BeforeEach
        public void initStack() {
            stack = new Stack<>();
            stack.push(item);
        }

        @Test
        public void afterPushingNotEmptyTest() {
            assertFalse(stack.isEmpty());
        }

        @Test
        public void afterPushingPoppedTest() {
            assertEquals(item, stack.pop());
            assertTrue(stack.isEmpty());
        }

        @Test
        public void afterPushingPeekedTest() {
            assertEquals(item, stack.peek());
            assertFalse(stack.isEmpty());
        }
    }


}
