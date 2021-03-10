package tw.fondus.demo.zk.spring.boot.mvvm.viewmodel;

import lombok.Getter;
import lombok.Setter;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.SmartNotifyChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class IndexVM {
	private final String root = "http://localhost:9000/";
	private List<String> demos;
	@Setter
	private String selectDemo;
	@Setter
	private String page;

	@Init
	public void init(){
		this.demos = new ArrayList<>();
		this.demos.addAll( Arrays.asList(
				"basic",
				"global_command",
				"client_binding"
		) );
		this.selectDemo = this.demos.get( 0 );
		this.selectDemo();
	}

	@Command
	@SmartNotifyChange( "page" )
	public void selectDemo(){
		this.page = this.root + this.selectDemo;
	}
}
