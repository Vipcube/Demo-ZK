package tw.fondus.demo.zk.spring.boot.mvc.service;

import org.springframework.stereotype.Service;
import tw.fondus.demo.zk.spring.boot.mvc.vo.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService {
	private final List<Car> cars;

	public CarService(){
		this.cars = new ArrayList<>();
		this.cars.add( Car.builder()
				.id( 1 )
				.name( "Nissan" )
				.price( 23320 )
				.build() );

		this.cars.add( Car.builder()
				.id( 2 )
				.name( "Toyota" )
				.price( 24170 )
				.build() );

		this.cars.add( Car.builder()
				.id( 3 )
				.name( "Honda" )
				.price( 17479 )
				.build() );
	}

	@Override
	public List<Car> findAll() {
		return this.cars;
	}
}
