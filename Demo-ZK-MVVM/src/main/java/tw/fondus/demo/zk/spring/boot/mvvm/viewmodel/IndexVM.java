package tw.fondus.demo.zk.spring.boot.mvvm.viewmodel;

import lombok.Getter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.SmartNotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import tw.fondus.demo.zk.spring.boot.mvvm.service.ICarService;
import tw.fondus.demo.zk.spring.boot.mvvm.vo.Car;

import java.util.ArrayList;
import java.util.List;

@VariableResolver( org.zkoss.zkplus.spring.DelegatingVariableResolver.class )
public class IndexVM {
	@WireVariable
	private ICarService carService;

	@Getter
	private int count;
	@Getter
	private List<Car> model;

	@Init
	public void init(){
		this.count = 100;
		this.model = new ArrayList<>();
	}

	@Command
	@SmartNotifyChange( "count" )
	public void add() {
		++count;
	}

	@Command
	@NotifyChange( "model" )
	public void search(){
		this.model.clear();
		this.model.addAll( this.carService.findAll() );
	}
}
