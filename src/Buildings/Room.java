package Buildings;

public class Room {

    private String name;
    private Door leftDoor;
    private Door rightDoor;

    public Room(String name, Door leftDoor, Door rightDoor){
        this.name = name;
        this.leftDoor = leftDoor;
        this.rightDoor = rightDoor;
    }
}
