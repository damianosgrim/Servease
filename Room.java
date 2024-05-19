package servease_test;

public class Room {
    private int id;
    private boolean isActive;

    public Room(int id, boolean isActive) {
        this.id = id;
        this.isActive = isActive;
    }

    public boolean checkRoomCharge() {
        // Έλεγχος χρέωσης δωματίου
        return isActive;
    }
}