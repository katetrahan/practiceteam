package models;

import java.util.ArrayList;

public class Member {
    private String first;
    private String last;
    private String description;

    public Member(String first, String last, String description){
        this.first = first;
        this.last = last;
        this.description = description;


    }

    public String getFirst(){
        return this.first;
    }

    public String getLast(){
        return this.last;
    }

    public String getDescription(){
        return this.description;
    }


}

