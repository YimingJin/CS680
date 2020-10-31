package edu.umb.cs680.hw06;

public class DrawerOpen implements State {
    private static DrawerOpen instance = null;
    private DrawerOpen() {}
    public static DrawerOpen getInstance() {
        if (instance == null) {
            instance = new DrawerOpen();
        }
        return instance;
    }
    public void openCloseButtonPushed() {
        player.close();
        player.changeState(DrawerClosedNotPlaying.getInstance());
    }
    public void playButtonPushed() {
        player.close();
        player.play();
        player.changeState(DrawerClosedPlaying.getInstance());
    }
    public void stopButtonPushed() {
        //empty();
    }
}
