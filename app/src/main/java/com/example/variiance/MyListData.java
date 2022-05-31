package com.example.variiance;

public class MyListData {
    private String clubName;
    private  int clubImage;


    public MyListData(String clubName, int clubImage) {
        this.clubName = clubName;
        this.clubImage = clubImage;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubImage() {
        return clubImage;
    }

    public void setClubImage(int clubImage) {
        this.clubImage = clubImage;
    }

}
