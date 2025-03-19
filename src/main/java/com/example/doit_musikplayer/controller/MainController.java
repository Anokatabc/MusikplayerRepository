package com.example.doit_musikplayer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MainController {

    public void clickPlay() {
        String uriString = new File("D:\\Musikmainaug2019\\Aku no Hana\\\uD83D\uDC40 Zankyou no Hana.mp3").toURI().toString();
        MediaPlayer player = new MediaPlayer(new Media(uriString));
        player.play();
        System.out.println("Playing: "+uriString);
    }





}