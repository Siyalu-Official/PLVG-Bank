module com.plvg.bnk {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive java.sql;
    requires org.xerial.sqlitejdbc;
    requires de.jensd.fx.glyphs.fontawesome;

    opens com.plvg.bnk to javafx.fxml;

    exports com.plvg.bnk;
    exports com.plvg.bnk.Controllers;
    exports com.plvg.bnk.Controllers.Admin;
    exports com.plvg.bnk.Controllers.Client;
    exports com.plvg.bnk.Models;
    exports com.plvg.bnk.Views;

}
