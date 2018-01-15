package ObjectPool;

import BuilderSimple.Car;

import java.util.LinkedList;
import java.util.List;

public class ObjectPool {
    private List<Car> free = new LinkedList<>();
    private List<Car> user = new LinkedList<>();

    public List<Car> getFree() {
        return free;
    }

    public List<Car> getUser() {
        return user;
    }

    public Car getObject() {
        if (free.isEmpty()) {
            Car car = new Car();
            user.add(car);
            return car;
        } else {
            Car car = free.get(0);
            user.add(car);
            free.remove(car);
            return car;
        }
    }

    public void releaseObject(Car car) {
        user.remove(car);
        free.add(car);
    }
}
