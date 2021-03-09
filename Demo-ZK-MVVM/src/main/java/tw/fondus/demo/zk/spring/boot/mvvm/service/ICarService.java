package tw.fondus.demo.zk.spring.boot.mvvm.service;

import tw.fondus.demo.zk.spring.boot.mvvm.vo.Car;

import java.util.List;

public interface ICarService {
	List<Car> findAll();
}
