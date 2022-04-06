import classes.Castle;
import classes.House;
import classes.Rock;
import enumerations.Ematerial;

public class Entry {
    public static void main(String[] args){
            Rock c = new Rock("racaillou",45, 50);
            System.out.println(c);

            House h = new House("Maison bleue",489,25,50000, Ematerial.WOOD);
            System.out.println(h);

            Castle ct = new Castle("Versaille",129,58,8000000,Ematerial.BRICK,100);
            System.out.println(ct.getName());


    }
}
