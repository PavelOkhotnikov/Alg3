package com.company;


public class Main {

    public static void main(String[] args) {

        Reverser reverser = new Reverser();
        reverser.reverse(reverser.setString());

        Deque deque = new Deque(15);
        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.insertLeft(22);
        System.out.println(deque.getTail());
        deque.insertLeft(33);
        System.out.println(deque.getTail());
        deque.insertLeft(44);
        System.out.println(deque.getTail());
        deque.insertRight(55);
        System.out.println(deque.getTail());
        System.out.println(deque);
    }
}
