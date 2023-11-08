package controller.tab;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EspcClienteTabController {
	public void addTabElementos(Tab tab) {
		Label lblmsg = new Label ("Olá. Este é seu espaço para realizr serviços refrentes a sua conta!");
		
		Button btndadospessoais = new Button("Meus dados pessoais");
		Button btncompras = new Button("Minhas compras");
		
		btndadospessoais.setPrefWidth(300);
		btndadospessoais.setPrefHeight(100);
		btncompras.setPrefWidth(300);
		btncompras.setPrefHeight(100);
		
		HBox primeiralinha = new HBox(1); 
		HBox segundalinha = new HBox(2); 
		
		primeiralinha.getChildren().addAll(lblmsg);
		segundalinha.getChildren().addAll(btndadospessoais, btncompras);
		
		VBox vbox = new VBox (4);
		Insets insert= new Insets(100,50,100,50);
		vbox.setPadding(insert);
		vbox.getChildren().addAll(primeiralinha,segundalinha);
		tab.setContent(vbox);
	}
}
