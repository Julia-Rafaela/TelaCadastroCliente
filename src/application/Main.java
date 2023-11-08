package application;
	
import controller.tab.ClienteTabController;
import controller.tab.EspcClienteTabController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TabPane tabpane = new TabPane();
			Tab tab1 = new Tab("Cadastrar Cliente", new Label("Cadastrar Cliente"));
			Tab tab2 = new Tab("Espaço do Cliente", new Label("Espaço do Cliente"));
			tabpane.getTabs().add(tab1);
			tabpane.getTabs().add(tab2);
			VBox vbox = new VBox(tabpane);
			Scene scene = new Scene(vbox,700,600);
			ClienteTabController clicontrol = new ClienteTabController ();
			EspcClienteTabController cliespccontrol = new EspcClienteTabController ();
			clicontrol.addTabElementos(tab1);
			cliespccontrol.addTabElementos(tab2);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Cliente");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
