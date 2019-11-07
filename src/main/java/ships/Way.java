package ships;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

public class Way {
    private ArrayList<Stage> stages;
    private ArrayList<Port> ports; //для портов - источников грузов, т.к. приемник один
    private CyclicBarrier cyclicBarrier;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public CyclicBarrier getCyclicBarrier() {
        return cyclicBarrier;
    }

    public ArrayList<Port> getPorts() {
        return ports;
    }

    public Way(int ship, Port[] ports, Stage... stages) {
        this.ports = new ArrayList<Port>(Arrays.asList(ports));
        this.stages = new ArrayList<>(Arrays.asList(stages));
        cyclicBarrier = new CyclicBarrier(ship);
    }
}
