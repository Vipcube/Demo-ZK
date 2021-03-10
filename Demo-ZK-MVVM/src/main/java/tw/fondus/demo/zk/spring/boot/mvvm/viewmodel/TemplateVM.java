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
public class TemplateVM {
	private List<String> templates;
	@Setter
	private String selectTemplate;
	private String template;

	@Init
	public void init(){
		this.templates = new ArrayList<>();
		this.templates.addAll( Arrays.asList(
				"template1",
				"template2"
		) );
		this.selectTemplate = this.templates.get( 0 );
		this.selectTemplate();
	}

	@Command
	@SmartNotifyChange( "template" )
	public void selectTemplate(){
		this.template = this.selectTemplate;
	}
}
