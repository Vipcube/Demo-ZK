package tw.fondus.demo.zk.spring.boot.mvc.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
	private int id;
	private String name;
	private int price;
}
