package models;

import java.util.ArrayList;

public class Members {
    private String name;
    private String description;
    private static ArrayList<Members> instances = new ArrayList<>();
    private int memberId;
    public Members(String name, String description){
        this.name = name;
        this.description = description;
        instances.add(this);
        this.memberId = instances.size();
    }

    public static void clearAll() {instances.clear();}


}

