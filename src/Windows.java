public class Windows {
    String materialOfFrame;

    int number;
    float widthOfWindows;                //centimetres

    Windows() {
        materialOfFrame = "plastic";
        widthOfWindows = 140;
        number = 2;
    }

    void open(){
        System.out.println("The windows are opened.");
    }

    void close(){
        System.out.println("The windows are closed.");
    }

    void information(){
        System.out.printf("There are %s windows in the house. The width of them is %s centimetres and they are of %s.\n", number, widthOfWindows, materialOfFrame);

    }
}
