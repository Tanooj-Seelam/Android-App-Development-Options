package com.example.recycleviewmail;

public class ModelClass {

    private int img1;
    private String txt1, txt2, txt3, time;

    ModelClass(int img1,String txt1,String txt2,String txt3,String time)
    {
        this.img1 = img1;
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.time = time;
    }

    public int getImg1() {
        return img1;
    }

    public String getTxt1() {
        return txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public String getTime() {
        return time;
    }
}
