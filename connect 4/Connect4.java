//Connect 4 application

// imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// class definition
public class Connect4 extends Application {
	// overridden init method
	@Override
	public void init() {
		// initialize the layout, create a CustomControl and it to the layout
		sp_mainlayout = new StackPane();
		cc_custom = new CustomControl();
		sp_mainlayout.getChildren().add(cc_custom);
		
		
	}
	// overridden start method
	@Override
	public void start(Stage primaryStage) {
		// set the title and scene, and show the stage
		primaryStage.setTitle("Connect Four");
		primaryStage.setScene(new Scene(sp_mainlayout, 700, 600));
		primaryStage.show();
		
	}

	// overridden stop method
	@Override
	public void stop() {
		
	}
	
	// entry point into our program to launch our JavaFX application
	public static void main(String[] args) {
		launch(args);
		
		
		
	}
	// private fields for this class
	private StackPane sp_mainlayout;	//layout which allows items to be positioned on top of each other
	private CustomControl cc_custom;    //control which has a board and detects mouse and keyboard events
   
}   

