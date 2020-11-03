package Main;

//import DataStorage.Database;
import Domain.*;
import View.ThreeDView;
import View.TwoDView;
import javafx.application.Application;
        import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * @author Rodney & Stijn
 */

    public class Main extends Application {

    // 1. Create the model that the application uses
    private ShapeHolder shapeHolder;

        @Override
    public void init() throws Exception {
        this.shapeHolder = new ShapeHolder();

    }

        @Override
        public void start(Stage window) {

            // 2. Create the views ("subviews")
            TwoDView twoDView = new TwoDView(shapeHolder);
            ThreeDView threeDView = new ThreeDView(shapeHolder);

            // 3. Create the higher level layout
            TabPane layout = new TabPane(  );
            layout.setTabClosingPolicy( TabPane.TabClosingPolicy.UNAVAILABLE );

            // 4. Create the menu for the general layout using TabPanes
            Tab twoDShapes = new Tab( "2D-Shapes", twoDView.getView() );
            Tab threeDShapes = new Tab( "3D-Shapes", threeDView.getView() );

            layout.getTabs().addAll( twoDShapes, threeDShapes );

            // 5. First show the input View
            layout.getSelectionModel().select( twoDShapes );

            // 6. Create the main View and add the high level layout
            Scene scene = new Scene(layout, 600, 650);

            window.setScene(scene);
            window.show();

            // 7. Show the application
            window.show();

//            //AddUniqueID!!!!
//            Block block = new Block( 4,5, 6 );
//            System.out.println(block.getUniqueId());



        }

        public static void main (String[]args) {
            try {
                launch( Main.class );
            } catch (Exception e) {
                System.out.println( e.getMessage() );
            }

        }
    }


