package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarsDAOImpl implements CarsDAO{

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Moskvitch","412", "yellow"));
        cars.add(new Car("Volga","21","white"));
        cars.add(new Car("Zhiguli","2101", "red"));
        cars.add(new Car("Zaporoshets","968","orange"));
        cars.add(new Car("YAZ","469","brown"));

    }
    @Override
    public List<Car> getCars (Integer count) {
        if (count == null) {
           return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

}



