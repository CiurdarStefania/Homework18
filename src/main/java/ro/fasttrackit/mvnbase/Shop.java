package ro.fasttrackit.mvnbase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<Clothes> {
    private final List<Clothes> item;

    public Shop(List<Clothes> item) {
        this.item = item;
    }

    public List<Clothes> getItem() {
        return item;
    }

    public void addItme(Clothes item) {
        addItme(item);
    }

    public List<Clothes> findByCategory(Category cat) {
        List<Clothes> result = new ArrayList<>();
        for (Clothes clothes : item) {
            if (clothes.Category().equals(cat)) {

            }

        }
    }

    public List<Clothes> findWithLowerPrice(int maxPrice) {
        List<Clothes> result = new ArrayList<>();
    }

    public Clothes findByName(String name) {
        for (Clothes clothes : item) {
            if (clothes.category.equals(name)) {

            }
        }
    }

    public Clothes removeItem(String name) {
        for (Clothes clothes : item) {
            if (clothes.category.equals(name)) {
                removeItem(name);
            }
        }
        return ..;

    }


}
