package edu.umb.cs680.hw06;

public interface State {
    DVDPlayer player = DVDPlayer.getInstance();
    public void openCloseButtonPushed();
    public void playButtonPushed();
    public void stopButtonPushed();
}
