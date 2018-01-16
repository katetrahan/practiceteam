package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private static ArrayList<String> mInstances = new ArrayList<>();
    private static ArrayList<Team> instances = new ArrayList<>();
    private int memberId;
    public Team(String name, String description, String member){
        this.name = name;
        this.description = description;
//     this.mInstances = member;
        instances.add(this);
        mInstances.add(member);
        this.memberId = instances.size();
    }

    public static void clearAll() {
        instances.clear();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public static ArrayList<String> getmInstances() {
        return mInstances;
    }



    public String getMember() {
        String string = "";
        for (String eachMember: this.mInstances){
            string += eachMember + ",";
        }
        return string;

    }

    public int getMemberId(){
        return this.memberId;
    }

    public static ArrayList<Team> getAll(){
        return instances;
    }

    public static Team findById(int teamNameId){
        return instances.get(teamNameId-1);
    }

    public static void addMembers (ArrayList member ){
        mInstances = member;
    }

    public void edit(String name, String description, String member){
        this.name = name;
        this.description = description;
        mInstances.add(member);


    }


    }



