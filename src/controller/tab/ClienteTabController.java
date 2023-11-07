package controller.tab;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ClienteTabController {

	public void addTabElementos(Tab tab) {
		Label lblnome = new Label("Nome completo:");
		Label lblcpf = new Label("CPF:");
		Label lbldatanasc = new Label("Data de Nascimento:");
		Label lblsenha = new Label("Senha:");
		Label lblconfsenha = new Label("Confirme a senha:");
		Label lblemail= new Label("Email Principal:");
		Label lbltele = new Label("Telefone:");
		Label lblcep = new Label("CEP:");
		Label lbllog = new Label("Logradouro:");
		Label lblnum = new Label("Número:");
		Label lblcomp = new Label("Complemento:");
		Label lblbairro = new Label("Bairro:");
		Label lblcidade = new Label("Cidade:");
		Label lblestado = new Label("Estado:");
		Label lblpontoref = new Label("Ponto de referencia:");
		Label lblnovoend = new Label("Novo endereço:");
		
		lblnome.setPrefWidth(110);
		lblcpf.setPrefWidth(110);
		lbldatanasc.setPrefWidth(110);
		lblsenha.setPrefWidth(110);
		lblconfsenha.setPrefWidth(110);
		lblemail.setPrefWidth(110);
		lbltele.setPrefWidth(110);
		lblcep.setPrefWidth(110);
		lbllog.setPrefWidth(110);
		lblnum.setPrefWidth(110);
		lblcomp.setPrefWidth(110);
		lblbairro.setPrefWidth(110);
		lblcidade.setPrefWidth(110);
		lblestado.setPrefWidth(110);
		lblpontoref.setPrefWidth(110);
		lblnovoend.setPrefWidth(110);
		
		TextField txtnome = new TextField();
		TextField txtcpf = new TextField();
		TextField txtdatanasc = new TextField();
		TextField txtsenha = new TextField();
		TextField txtconfsenha = new TextField();
		TextField txtemail = new TextField();
		TextField txttele = new TextField();
		TextField txtcep = new TextField();
		TextField txtlog = new TextField();
		TextField txtnum = new TextField();
		TextField txtcomp = new TextField();
		TextField txtbairro = new TextField();
		TextField txtcidade = new TextField();
		TextField txtestado = new TextField();
		TextField txtpontoref = new TextField();
		TextField txtnovoend = new TextField();
		
		txtnome.setMaxWidth(200);
		txtcpf.setPrefWidth(75);
	    txtdatanasc.setPrefWidth(75); 
		txtsenha.setPrefWidth(75);
	    txtconfsenha.setPrefWidth(75);
		txtemail.setMaxWidth(200);
	    txttele.setPrefWidth(75);
	    txtcep .setPrefWidth(75);
	    txtlog.setMaxWidth(150);
	    txtnum.setPrefWidth(75);
	    txtcomp.setPrefWidth(75);
	    txtbairro.setMaxWidth(200);
	    txtcidade.setMaxWidth(200);
	    txtestado.setPrefWidth(75);
	    txtpontoref.setMaxWidth(200);
	    txtnovoend.setPrefWidth(75);
	    
	    Button btnCadastrar = new  Button("Cadastrar");
	    Button btnNovoEnd = new  Button("+ Endereço");
	    btnCadastrar.setPrefWidth(75);
	    btnNovoEnd.setPrefWidth(90);
	    

        GridPane gridPane = new GridPane();
        gridPane.setHgap(15); 
        gridPane.setVgap(15); 

        gridPane.addRow(0, lblnome, txtnome, lblcep, txtcep);
        gridPane.addRow(1, lblcpf, txtcpf, lbllog, txtlog);
        gridPane.addRow(2, lbldatanasc, txtdatanasc, lblnum, txtnum);
        gridPane.addRow(3, lblsenha, txtsenha, lblcomp, txtcomp);
        gridPane.addRow(4, lblconfsenha, txtconfsenha, lblbairro, txtbairro);
        gridPane.addRow(5, lblemail, txtemail, lblcidade,txtcidade);
        gridPane.addRow(6, lbltele, txttele, lblestado, txtestado);

     
	   
        gridPane.add(lblpontoref, 2, 7);
        gridPane.add(txtpontoref, 3, 7); 
        gridPane.add(lblnovoend, 2, 8); 
        gridPane.add(txtnovoend, 3, 8);  
        gridPane.add(btnNovoEnd, 3, 9);
        gridPane.add(btnCadastrar, 2, 11); 
        
	    VBox vbox = new VBox(10);
	    Insets insets = new Insets(10);
	    vbox.setPadding(insets);
	    vbox.getChildren().addAll(gridPane);
	    tab.setContent(vbox);
	    
	}
	
}
