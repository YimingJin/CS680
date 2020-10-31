package edu.umb.cs680.hw06;

public class DrawerClosedPlaying implements State {
    private static DrawerClosedPlaying instance = null;
    private DrawerClosedPlaying() {}
    public static DrawerClosedPlaying getInstance() {
        if (instance == null) {
            instance = new DrawerClosedPlaying();
        }
        return instance;
    }
    public void openCloseButtonPushed() {
        player.stop();
        player.open();
        player.changeState(DrawerOpen.getInstance());
    }
    public void playButtonPushed() {
        //empty();
    }
    public void stopButtonPushed() {
        player.stop();
        player.changeState(DrawerClosedNotPlaying.getInstance());
    }
}
