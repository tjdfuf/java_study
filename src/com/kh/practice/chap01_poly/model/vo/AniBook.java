package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{

    int accessAge; // 제한나이

    public AniBook() {

    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "accessAge=" + accessAge +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
