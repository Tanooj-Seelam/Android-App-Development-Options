package com.example.mailrecycleview;

public class object_data {
    String Sender , Subject , text;
    int resId;

    public object_data(String sender, String subject, String text, int resId)
    {
        this.Sender = sender;
        this.Subject = subject;
        this.text = text;
        this.resId = resId;
    }

    public String getSender() { return Sender;}

    public String getSubject() { return Subject;}

    public  String getText() { return text;}

    public int getResId() {
        return resId;
    }
}
