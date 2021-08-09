package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarsDAO {

    List<Car> getCars(Integer count);
}
