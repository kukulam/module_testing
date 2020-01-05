package kukulam.module.testing.level.D.car;

class CarRepository {

    private Car[] cars = new Car[0];

    Car[] findAll() {
        return cars;
    }

    Car[] findByAge(int age) {
        int amountOfFoundCars = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getAge() == age) {
                amountOfFoundCars++;
            }
        }

        Car[] foundPeople = new Car[amountOfFoundCars];
        for (int i = 0, j = 0; i < cars.length; i++) {
            if (cars[i].getAge() == age) {
                foundPeople[j] = cars[i];
                j++;
            }
        }

        return foundPeople;
    }

    void add(Car car) {
        Car[] updatedCars = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            updatedCars[i] = cars[i];
        }
        updatedCars[cars.length] = car;

        cars = updatedCars;
    }

    Car[] findByName(String name) {
        int amountOfFoundCars = 0;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName() == name) {
                amountOfFoundCars++;
            }
        }

        Car[] foundPeople = new Car[amountOfFoundCars];
        for (int i = 0, j = 0; i < cars.length; i++) {
            if (cars[i].getName() == name) {
                foundPeople[j] = cars[i];
                j++;
            }
        }

        return foundPeople;
    }
}
