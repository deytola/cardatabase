//package com.springreact.cardatabase;
//
//import com.springreact.cardatabase.domain.CarRepository;
//import com.springreact.cardatabase.entity.Car;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class CarRepositoryTest {
//    @Autowired
//    private TestEntityManager testEntityManager;
//    @Autowired
//    private CarRepository carRepository;
//
//    @Test
//    public void saveCar(){
//        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000);
//        testEntityManager.persistAndFlush(car);
//        assertThat(car.getId()).isNotNull();
//    }
//
//    @Test
//    public void deleteCars(){
//       testEntityManager.persistAndFlush(new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000));
//       testEntityManager.persistAndFlush(new Car("Mini Cooper", "Model T", "black", "ABC-4565", 2017, 86099));
//       carRepository.deleteAll();
//       assertThat(carRepository.findAll()).isEmpty();
//
//    }
//}
