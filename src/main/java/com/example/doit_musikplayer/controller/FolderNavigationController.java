package com.example.doit_musikplayer.controller;

import javafx.scene.control.TreeItem;

public class FolderNavigationController {

    private String dirPath = "Dieser PC";

private void createTreeView(String treeViewPath){

    TreeItem<String> root = new TreeItem<String>("Root Node");
    root.setExpanded(true);
    root.getChildren().addAll(
            new TreeItem<String>("Item 1"),
            new TreeItem<String>("Item 2"),
            new TreeItem<String>("Item 3")
    );


    }
}

//<TreeView fx:id="folderTreeView" onMouseClicked="#handleFolderSelection"/>

