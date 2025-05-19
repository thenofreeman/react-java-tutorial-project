package com.packt.cardatabase.domain;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.repository.PagingAndSortingRepository;

// public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
public interface CarRepository extends CrudRepository<Car, Long> {
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);
    List<Car> findByColor(String color);
    List<Car> findByModelYear(int modelYear);
    List<Car> findByBrandAndModel(String brand, String model);
    List<Car> findByBrandAndColor(String brand, String model);
    List<Car> findByBrandOrderByModelYearAsc(String brand);

    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandLike(String brand);

}
