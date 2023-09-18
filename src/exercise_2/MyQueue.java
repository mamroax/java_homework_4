package exercise_2;

import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    LinkedList<T> linkedList = new LinkedList();
    public void enqueue(T element){
        // enqueue() - помещает элемент в конец очереди
        linkedList.add(element);
    }

    public T dequeue(){
        // dequeue() - возвращает первый элемент из очереди и удаляет его
        return linkedList.pop();
    }

    public T first(){
        // first() - возвращает первый элемент из очереди, не удаляя
        return linkedList.getFirst();
    }

    public LinkedList<T> getElements() {
        // getElements() - возвращает все элементы в очереди
        return linkedList;
    }
}
