package com.example.doit_musikplayer.model;

import java.io.File;
import java.util.Map;

public class Song {

    private String path;
    //private Map<String, Object> metadata; //variable Datenstruktur für Metadaten. String: Object (Lyrics, BPM, Length)
    //variable datenstruktur dictionary keys vales metadata

    public Song(String path) {
        this.path = path;
        //this.metadata = metadata;
    }

    public String getPath() {
        return path;
    }
}
    //public Map<String, Object> getMetadata() {
    //    return metadata;
    //}

    //public void addMetadata(String key, Object value){
    //    this.metadata.put(key, value);
    //}

    //public String getMetadataValue(String key){
    //    return this.metadata.get(key);
    //}

    //public void deleteMetadataValue(String key){
    //    this.metadata.remove();
    //}
    // tbc: database query


//public class Song {
//    private String filePath;
//
//    public Song(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public String getFilePath() {
//        return filePath;
//    }
//
//    @Override
//    public String toString() {
//        return new File(filePath).getName(); // Display only filename in TableView
//    }
//
//}

