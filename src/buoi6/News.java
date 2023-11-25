package buoi6;

import java.util.ArrayList;

public class News implements INews{


    int ID ;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    Float AverageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Float getAverageRate() {
        return AverageRate;
    }

   ArrayList<Integer> RateList;
    // CONSTRUCTOR Start
    public News() {
        RateList = new ArrayList<>();
    }
    public News(int ID, String title, String publishDate, String author, String content, Float averageRate, int rate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
        RateList = new ArrayList<>();
        if(rate<=5 && rate >=1) {
            RateList.add(rate);
        }
    }
    // CONSTRUCTOR End

    void Calculate() {
        if(RateList.isEmpty()) {
            this.AverageRate = 0.0f;
        }
        int sum = 0;
        for (Integer rate : RateList) {
            sum += rate;
        }

        this.AverageRate = (float) sum / RateList.size();
    }
    void InputRate(int rate) {
        if(rate<=5 && rate >=1) {
            RateList.add(rate);
            this.Calculate();
        }
    }

    @Override
    public void Display() {
        System.out.println("Id:"+this.getID());
        System.out.println("Title:"+this.getTitle());
        System.out.println("PublishDate:"+this.getPublishDate());
        System.out.println("Author:"+this.getAuthor());
        System.out.println("Content:"+this.getContent());
        System.out.println("AverageRate:"+this.getAverageRate());
    }

}
