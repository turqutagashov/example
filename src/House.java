public class House {

    String colour;
    String location;                        // 16 King Street
    String heightOfHouse;

    Owner owner = new Owner();
    Windows windows = new Windows();
    Door door = new Door();
    House(){
        colour = "Blue";
        heightOfHouse = "4 metres";
    }

}