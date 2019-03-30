package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] array;
        int summa = 0;
        array = new int[20];
        FibonacciInitializer fibin = new FibonacciInitializer();
        RandomInitializer randin = new RandomInitializer(-50, 50);
        BubbleSort bubsort = new BubbleSort();
        SelectionSort selsort = new SelectionSort();
        ShellSort shellsort = new ShellSort();
        fibin.initialize(array);
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        randin.initialize(array);
        bubsort.sort(array);
        randin.initialize(array);
        selsort.sort(array);
        randin.initialize(array);
        shellsort.sort(array);

	    /*
	     * Выполнены действия над массивом чисел
	     *
	     * 0. Создн массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализирован массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найдена сумму элементов массива.
	     *
	     * 3. Проинициализирован массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортирован массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализирован массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортирован массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализирован массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортирован массив с использованием
         *    сортировки Шелла.
	     */
    }
    
    
}
