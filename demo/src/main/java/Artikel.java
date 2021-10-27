import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Model;

@Model
@ManagedBean
@ApplicationScoped
public class Artikel {
    private int position;
    private String name;
    private String beschreibung;
    private double preis;

    public Artikel(){

    }
    public Artikel(int position,String name, String beschreibung, double preis) {
        this.position = position;
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

}


