package exercise_1;

import java.util.Collections;
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
//        LinkedList<Object> revLinkedList = new LinkedList<>();
//        for (int i = ll.size() - 1; i >= 0; i--) {
//            revLinkedList.add(ll.get(i));
//        }
//        return revLinkedList;
        Collections.reverse(ll);
        return ll;
    }
}
