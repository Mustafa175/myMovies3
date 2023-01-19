module com.example.mymovies3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mymovies3 to javafx.fxml;
    exports com.example.mymovies3;
}