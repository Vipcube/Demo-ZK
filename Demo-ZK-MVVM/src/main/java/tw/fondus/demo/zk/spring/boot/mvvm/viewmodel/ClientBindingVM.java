package tw.fondus.demo.zk.spring.boot.mvvm.viewmodel;

import lombok.Getter;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyCommand;
import org.zkoss.bind.annotation.NotifyCommands;
import org.zkoss.bind.annotation.SmartNotifyChange;
import org.zkoss.bind.annotation.ToClientCommand;
import org.zkoss.bind.annotation.ToServerCommand;

@NotifyCommands( {
		@NotifyCommand( value="modelStateChange", onChange="_vm_.count" )
} )
@ToServerCommand({
		"addByClient"
})
@ToClientCommand( {
		"modelStateChange"
} )
public class ClientBindingVM {
	@Getter
	private int count;

	@Init
	public void init(){
		this.count = 100;
	}

	@Command
	@SmartNotifyChange( "count" )
	public void add() {
		++count;
	}

	@Command
	@SmartNotifyChange( "count" )
	public void addByClient( @BindingParam int value ) {
		count = count + value;
	}
}
