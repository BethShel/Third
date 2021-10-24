package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Calculator {
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        Integer result = 0;
        int ten = 1, save = 0;
        Iterator<Integer> first, second;
        first = firstNumber.iterator();
        second = secondNumber.iterator();
        while (first.hasNext() && second.hasNext()) {
            Integer tmp = first.next() + second.next() + save;
            if (tmp > 10) {
                result = (tmp % 10) * ten + result;
                save = 1;
            } else {
                result = tmp * ten + result;
                save = 0;
            }
            ten *= 10;
        }
        if (save > 0) {
            result = save * ten + result;
        }
        if (first.hasNext()) {
            result = first.next() * ten + result;
        } else if (second.hasNext()) {
            result = second.next() * ten + result;
        }
        return result;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Iterator<T> iterator = result.iterator();
        int counter = 1;
        while (iterator.hasNext()) {
            iterator.next();
            if (counter % 2 == 0) {
                iterator.remove();
            }
            counter++;
        }
        return result;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Iterator<T> iterator = result.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (counter != 0 && iterator.hasNext()) {
                iterator.remove();
            }
            counter++;
        }
        return result;
    }
}
