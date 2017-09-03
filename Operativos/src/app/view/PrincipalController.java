package app.view;

import com.jfoenix.controls.JFXListView;

import app.Principal;
import app.model.Proceso;
import javafx.fxml.FXML;

public class PrincipalController {
	@FXML
	private JFXListView<Proceso> listo;
	@FXML
	private JFXListView<Proceso> ejecutado;
	@FXML
	private JFXListView<Proceso> bloqueado;
	@FXML
	private JFXListView<Proceso> terminado;
	private Principal principal;

	public PrincipalController(){

	}
	public void setPrincipal(Principal principal){
		this.principal = principal;
	}
}

