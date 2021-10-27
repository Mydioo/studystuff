import jakarta.annotation.ManagedBean;
import jakarta.enterprise.inject.Model;
import jakarta.faces.view.ViewScoped;

import java.io.Serializable;

@ViewScoped
@Model
@ManagedBean
public class Controller implements Serializable {

    private int index = 0;

    public Artikel getArtikel(){
        return Shop.getInstance().getShopinhalt().get(index);
    }

    public void vor(){
        if (index < Shop.getInstance().getShopinhalt().size()-1)
            index ++;
    }
    public void zurueck(){
        if (index > 0)
            index --;
    }
}
