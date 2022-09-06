module com.silverlink.treeviewfxpractice {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.silverlink.treeviewfxpractice to javafx.fxml;
    exports com.silverlink.treeviewfxpractice;
}