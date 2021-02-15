import CustomArray.HighArray;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]){

        int max = 100;
        HighArray arr = new HighArray(max);
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

        int searchKey = 35;
        if( arr.find(searchKey)) System.out.println("Found " + searchKey);
        else System.out.println("Can’t find " + searchKey);
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();

    }
}
