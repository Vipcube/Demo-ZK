package tw.fondus.demo.zk.spring.boot.mvvm.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
	private int id;
	private String name;
	private int price;
}
