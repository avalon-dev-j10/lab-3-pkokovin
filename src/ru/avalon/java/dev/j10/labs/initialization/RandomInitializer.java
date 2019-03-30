package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private final Random random = new Random();
    private int minRand;
    private int maxRand;
    private int rangeRand;

    public RandomInitializer(int minRand, int maxRand) {
        this.minRand = minRand;
        this.maxRand = maxRand;
        this.rangeRand = maxRand - minRand;
    }

    public void setMinRand(int minRand) {
        this.minRand = minRand;
    }

    public void setMaxRand(int maxRand) {
        this.maxRand = maxRand;
    }

    public int getMinRand() {
        return minRand;
    }

    public int getMaxRand() {
        return maxRand;
    }

    public int getRangeRand() {
        return rangeRand;
    }
    
    
    

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    
    public void initialize(int[] array) {
        /*
         * Реализован метод initialize класса RandomInitializer
         */
        if (minRand < 0) {
            for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangeRand) + minRand;
            }
        } else {      
         for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rangeRand);
        }
    }
    }
}