package fastcampus.chapter03.ch15;

import java.util.ArrayList;

/**
 * packageName : fastcampus.chapter03.ch15
 * className : Shelf
 * user : jwlee
 * date : 2022/11/02
 */
public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        this.shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return this.shelf;
    }

    public int getCount() {
        return this.shelf.size();
    }


}
