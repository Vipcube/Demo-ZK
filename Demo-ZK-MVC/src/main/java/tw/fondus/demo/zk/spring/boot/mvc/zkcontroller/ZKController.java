package tw.fondus.demo.zk.spring.boot.mvc.zkcontroller;

import lombok.Getter;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import tw.fondus.demo.zk.spring.boot.mvc.service.ICarService;

@VariableResolver( org.zkoss.zkplus.spring.DelegatingVariableResolver.class )
public class ZKController extends SelectorComposer<Component> {
	@Wire
	private Label show;
	@Wire
	private Listbox carListBox;

	@WireVariable
	private ICarService carService;

	@Getter
	private int count = 100;

	@AfterCompose
	public void afterCompose( @ContextParam( ContextType.VIEW ) Component view ) throws Exception {
		super.doAfterCompose( view );
	}

	@Listen("onClick = #add")
	public void add(){
		++count;
		this.show.setValue( String.valueOf( count ) );
	}

	@Listen("onClick = #search")
	public void search(){
		this.carListBox.setModel(new ListModelList<>( this.carService.findAll() ));
	}
}
