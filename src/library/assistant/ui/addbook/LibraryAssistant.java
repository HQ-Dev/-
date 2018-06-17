package library.assistant.ui.addbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Archy
 * @date Created at 2018/6/17
 **/
public class LibraryAssistant extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        /**
         * 其中使用 JFTextField 中的 promptText 属性，选中这个控件后，它的值会自动往上移动，这个效果很棒
         */


        Parent root = FXMLLoader.load(getClass().getResource("add_book.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
