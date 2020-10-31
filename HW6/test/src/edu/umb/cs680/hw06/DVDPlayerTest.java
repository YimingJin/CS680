package edu.umb.cs680.hw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DVDPlayerTest {
    @Test
    public void DrawerClosedPlayingWhenPlayButtonPushedWhilePlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        State expected = DrawerClosedPlaying.getInstance();
        assertEquals(expected, player.getState());
    }
    @Test
    public void DrawerOpenWhenOpenCloseButtonPushedWhilePlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        player.openCloseButtonPushed();
        State expected = DrawerOpen.getInstance();
        assertEquals(expected, player.getState());
    }
    @Test
    public void DrawerClosedNotPlayingWhenStopButtonPushedWhilePlaying() {
        DVDPlayer player = DVDPlayer.getInstance();
        player.playButtonPushed();
        player.stopButtonPushed();
        State expected = DrawerClosedNotPlaying.getInstance();
        assertEquals(expected, player.getState());
    }

}