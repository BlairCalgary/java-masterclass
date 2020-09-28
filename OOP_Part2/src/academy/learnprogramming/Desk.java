package academy.learnprogramming;

public class Desk {
    private boolean drawerIsOpen;

    public Desk(boolean drawIsOpen) {
        this.drawerIsOpen = drawIsOpen;
    }

    public void openDrawer() {
        if (drawerIsOpen) {
            System.out.println("Drawer is already open.");
        } else {
            this.drawerIsOpen = true;
            System.out.println("Drawer is now open.");
        }

    }
}
