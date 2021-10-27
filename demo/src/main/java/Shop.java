import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Model;

import java.util.ArrayList;
import java.util.List;

@Model
@ManagedBean
@ApplicationScoped
public class Shop {

    private List<Artikel> shopinhalt = new ArrayList<>();
    private static Shop instance = new Shop();


    public Shop(){
        shopinhalt.add(new Artikel(1,"Apfel","Rund und Rot.",35.66));
        shopinhalt.add(new Artikel(2,"Nuss","Oval und Braun",22.50));
        shopinhalt.add(new Artikel(3,"Karotte","Lang und Orange",13.33));
    }
    public List<Artikel> getShopinhalt(){
        return shopinhalt;
    }

    public static Shop getInstance(){
        return instance;
    }


}
