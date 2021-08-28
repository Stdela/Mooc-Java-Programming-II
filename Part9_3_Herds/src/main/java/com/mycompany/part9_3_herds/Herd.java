import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delam
 */
public class Herd implements Movable {
private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Herd" + organisms + 
                "\n" + " ";
    }
 public void addToHerd(Movable movable) {

        organisms.add(movable);
    }
@Override
public void move(int dx, int dy){
    for (Movable organism : organisms) {
        organism.move(dx, dy);
    }
}
}
