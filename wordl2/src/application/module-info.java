module wordl2 {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	
	opens controller to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
