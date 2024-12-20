package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewed {
    private final int viewListSize = 10;
    List<Item> recentlyViewed = new LinkedList<>();

    void addRecentlyViewedItem(Item item) {
        if (!recentlyViewed.contains(item) && recentlyViewed.size() < viewListSize) {
            recentlyViewed.addLast(item);
        } else if (recentlyViewed.contains(item) && recentlyViewed.size() < viewListSize) {
            recentlyViewed.remove(item);
            recentlyViewed.addLast(item);
        } else {
            recentlyViewed.removeFirst();
            recentlyViewed.addLast(item);
        }
    }
}
