package org.example;

import org.junit.jupiter.api.Test;

/**
 * Сигнатуры методов в данном классе не менять
 */
public class HomeWorkTest {

    @Test
    public void partitionByTest1() {
        HomeWork hw = new HomeWork();

        Node<Integer> list = new Node<>(1);
        list.add(2).add(3).add(4).add(5);

        assert hw.partitionBy(list, integer -> integer<4) == 3;
    }

    @Test
    public void partitionByTest2() {
        HomeWork hw = new HomeWork();

        Node<Integer> list = new Node<>(1);
        list.add(2).add(3).add(4).add(5);

        assert hw.partitionBy(list, integer -> integer<0) == 0;
    }

    @Test
    public void findNthElementTest1() {
        HomeWork hw = new HomeWork();

        Node<Integer> list = new Node<>(1);
        list.add(2).add(3).add(4).add(5);

        assert hw.findNthElement(list, 3) == 3;
    }
}
