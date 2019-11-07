package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

import static Lesson_5.MainClass.CARS_COUNT;

public class Race {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() { return stages; }

    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}



