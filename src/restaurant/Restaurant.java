package restaurant;

import java.util.ArrayList;

public class Restaurant {

public static void main(String[] args) {

    //create several items
    MenuItem pasta = new MenuItem("Fancy Pasta","delicious buttery pasta","entree", 29.99, true);
    MenuItem noodles = new MenuItem("Noodles","delicious buttery pasta","entree", 29.99, true);
    MenuItem macaroni = new MenuItem("Macaroni","delicious buttery pasta","entree", 29.99, true);

    Menu pastaInc = new Menu();

    //add items
     pastaInc.addItem(pasta);
    pastaInc.addItem(noodles);
    pastaInc.addItem(macaroni);

    //print whole menu
    pastaInc.printMenu();
    System.out.println();

    //print individual item
    System.out.println(pasta);
    System.out.println();

    //delete, noodles, then reprint menu
    pastaInc.removeItem(noodles);
    pastaInc.printMenu();

}

}
