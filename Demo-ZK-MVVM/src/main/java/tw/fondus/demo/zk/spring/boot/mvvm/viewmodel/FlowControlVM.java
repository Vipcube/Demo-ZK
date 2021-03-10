package tw.fondus.demo.zk.spring.boot.mvvm.viewmodel;

import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class FlowControlVM {
	private boolean visible;
	private List<String> model;
	private List<Integer> items;

	@Setter
	private int selectItem;

	@Init
	public void init(){
		this.visible = false;
		this.model = new ArrayList<>();
		this.model.addAll( Arrays.asList(
				"label1",
				"label2",
				"label3",
				"label4"
		) );

		this.items = new ArrayList<>();
		IntStream.range( 0, 10 ).forEach( i -> this.items.add( i ) );
		this.selectItem = this.items.get( 0 );
	}

	@Command
	@NotifyChange( "visible" )
	public void toggleVisible(){
		this.visible = !this.visible;
	}
}
