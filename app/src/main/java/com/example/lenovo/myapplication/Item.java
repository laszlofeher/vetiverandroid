package com.example.lenovo.myapplication;

/**
 * Created by Lenovo on 2018. 03. 03..
 */

public class Item {
    private String title;
    private String author;
    private String description;
    private int overallrating;
    private int vetcurriculum;
    private int userfriendly;
    private int classcapacity;

    public Item(String title, String author, String description, int overallrating, int vetcurriculum, int userfriendly, int classcapacity) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.overallrating = overallrating;
        this.vetcurriculum = vetcurriculum;
        this.userfriendly = userfriendly;
        this.classcapacity = classcapacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOverallrating() {
        return overallrating;
    }

    public void setOverallrating(int overallrating) {
        this.overallrating = overallrating;
    }

    public int getVetcurriculum() {
        return vetcurriculum;
    }

    public void setVetcurriculum(int vetcurriculum) {
        this.vetcurriculum = vetcurriculum;
    }

    public int getUserfriendly() {
        return userfriendly;
    }

    public void setUserfriendly(int userfriendly) {
        this.userfriendly = userfriendly;
    }

    public int getClasscapacity() {
        return classcapacity;
    }

    public void setClasscapacity(int classcapacity) {
        this.classcapacity = classcapacity;
    }
}
