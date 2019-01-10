package tw.fondus.demo.zk.spring.boot.simple.zk;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

/**
 * Sample view model.
 * 
 * @author Brad Chen
 *
 */
public class ViewModel {
	
	private int count;

	@Init
	public void init() {
		count = 100;
	}

	@Command
	@NotifyChange("count")
	public void cmd() {
		++count;
	}

	public int getCount() {
		return count;
	}
}
