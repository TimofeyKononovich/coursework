package com.television.coursework.Model;

public class Data {

    private int id;

    private int userId;

    private byte[] img;

    public Data(int id, int userId, byte[] img) {
        this.id = id;
        this.userId = userId;
        this.img = img;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
