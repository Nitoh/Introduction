package Buildings;

import Enums.eLeftRight;

public abstract class Room {

    protected String name;

    protected Door leftDoor;
    protected Door rightDoor;

    protected Room roomBehindLeftDoor;
    protected Room roomBehindRightDoor;

    private eLeftRight selectedDirection;

    public boolean tryToOpenDoor(eLeftRight direction) {
        selectedDirection = direction;

        if (direction == eLeftRight.Left) {
            this.leftDoor.open();
            return true;
        }
        if (direction == eLeftRight.Right) {
            this.rightDoor.open();
            return true;
        }

        return false;
    }

    public void getRoomIntroduction(){

    }

    public Room getIntoNextRoom() throws Exception {
        if (selectedDirection == eLeftRight.Left) return roomBehindLeftDoor;
        if (selectedDirection == eLeftRight.Left) return roomBehindRightDoor;
        else throw new Exception();
    }

}
