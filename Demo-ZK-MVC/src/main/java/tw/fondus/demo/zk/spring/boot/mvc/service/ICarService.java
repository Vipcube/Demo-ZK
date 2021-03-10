package tw.fondus.demo.zk.spring.boot.mvc.service;

import tw.fondus.demo.zk.spring.boot.mvc.vo.Car;

import java.util.List;

public interface ICarService {
	List<Car> findAll();
}
