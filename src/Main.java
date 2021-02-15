import CustomArray.HighArray;
import CustomArray.OrderedArray;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]){

        int max = 100;
        OrderedArray arr = new OrderedArray(max);
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        int searchKey = 55;
        if( arr.find(searchKey)) System.out.println("Found " + searchKey);
        else System.out.println("Can’t find " + searchKey);
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();

    }
}
