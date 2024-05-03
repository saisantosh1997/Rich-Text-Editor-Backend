package com.example.demo.model;

public class TextData {
    private int id;
    private String text;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public string getText() { return text; }

    public void setText(String text) { this.text = text; }

    @Override
    public String toString() {
        return "TextData{" + "id=" + id + ", text='" + text + '\'' + '}';
    }

    public TextData(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public TextData() {
        
    }
}
