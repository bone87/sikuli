package Multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static final Map<MultitonType, Multiton> instances = new HashMap<>();

    private MultitonType multitonType;

    private Multiton(MultitonType multitonType) {
        this.multitonType = multitonType;
    }

    public static Multiton getInstance(MultitonType multitonType) {
        if (!instances.containsKey(multitonType)) {
            instances.put(multitonType, new Multiton(multitonType));
        }
        return instances.get(multitonType);
    }

}
