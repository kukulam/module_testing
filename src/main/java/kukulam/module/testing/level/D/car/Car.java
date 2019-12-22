package kukulam.module.testing.level.D.car;

import java.util.Objects;

class Car {
    private final String name;
    private final int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
