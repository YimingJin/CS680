package edu.umb.cs680.hw06;

public class DVDPlayer {
    private static DVDPlayer player = null;
    private static State state;
    private DVDPlayer(State s) {
        state = s;
    }
    public static DVDPlayer getInstance() {
        if (player == null) {
            State s = DrawerClosedNotPlaying.getInstance();
            player = new DVDPlayer(s);
        }
        return player;
    }
    public void changeState(State s) {
        state = s;
    }
    public void openCloseButtonPushed() {
        state.openCloseButtonPushed();
    }
    public void playButtonPushed() {
        state.playButtonPushed();
    }
    public void stopButtonPushed() {
        state.stopButtonPushed();
    }
    public void open() {
        System.out.print("Drawer is open");
    }
    public void close() {
        System.out.print("Drawer is close");
    }
    public void play() {
        System.out.print("DVDPlayer is playing");
    }
    public void stop() {
        System.out.print("DVDPlayer stops playing");
    }
    public Object getState() {
        return state;
    }
    public static void main(String args[]) {
        DVDPlayer player = DVDPlayer.getInstance();
        player.openCloseButtonPushed();
        player.playButtonPushed();
        player.stopButtonPushed();
    }
}
