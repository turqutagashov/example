public class Door {

    String materialOfDoor;              //iron, wood
    String colourOfDoor;

    Door(){
        materialOfDoor = "wood";
        colourOfDoor = "brown";
    }

    void open(){
            System.out.println("The door is opened...");
        }

    void close(){
            System.out.println("The door is closed...");
        }

    void information(){
        System.out.printf("The colour of the door is %s. The door is of %s.\n", colourOfDoor, materialOfDoor);
    }

}
