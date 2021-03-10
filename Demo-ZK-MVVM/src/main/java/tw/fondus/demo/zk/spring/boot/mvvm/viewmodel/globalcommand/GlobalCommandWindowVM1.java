package tw.fondus.demo.zk.spring.boot.mvvm.viewmodel.globalcommand;

import lombok.Getter;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.SmartNotifyChange;

public class GlobalCommandWindowVM1 {
	@Getter
	private String text;

	@Init
	public void init(){
		this.text = "not receive";
	}

	@GlobalCommand( "post" )
	@SmartNotifyChange( "text" )
	public void receive( @BindingParam("args2") String message ){
		this.text = message + " receive!!!!!!!!";
	}
}
