package kukulam.module.testing.level.D.car;

import java.util.List;
import java.util.stream.Collectors;

class CarService {
    private final CarRepository repository;

    CarService(CarRepository repository) {
        this.repository = repository;
    }

    List<Car> findByAge(int withAge) {
        return repository.find()
                .stream()
                .filter(car -> car.getAge() == withAge)
                .collect(Collectors.toList());
    }

    void add(String name, int age) {
        Car car = new Car(name, age);
        repository.add(car);
    }

    List<Car> findByName(String name) {
        return repository.find()
                .stream()
                .filter(car -> car.getName().equals(name))
                .collect(Collectors.toList());
    }
}
