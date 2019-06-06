package ba.unsa.etf.rs.tutorijal9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BusController {
    public TextField fldMaker;
    public TextField fldSerija;
    public TextField fldBrSjedista;
    public Spinner spinerBrVozaca;
    private ba.unsa.etf.rs.tutorijal9.Bus bus;
    public BusController(ba.unsa.etf.rs.tutorijal9.Bus bus) {
        this.bus = bus;
    }

    @FXML
    public void initialize() {
        if (bus != null) {
            fldMaker.setText(bus.getProizvodjac());
            fldSerija.setText(bus.getSerija());
            fldBrSjedista.setText(String.valueOf(bus.getNumberOfSeats()));
            spinerBrVozaca.setPromptText(String.valueOf(bus.getNumberOfDrivers()));
        }
    }

    public void akcijaCancel(ActionEvent actionEvent) {
        bus = null;
        Stage stage = (Stage) fldMaker.getScene().getWindow();
        stage.close();
    }

    public void akcijaOk(ActionEvent actionEvent) {
        if (bus == null) bus = new ba.unsa.etf.rs.tutorijal9.Bus();
        bus.setProizvodjac(fldMaker.getText());
        bus.setSerija(fldSerija.getText());
        Stage stage = (Stage) fldMaker.getScene().getWindow();
        stage.close();
    }



    public ba.unsa.etf.rs.tutorijal9.Bus getBus() {
        return bus;
    }
}