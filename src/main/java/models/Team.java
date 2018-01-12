package models;

import java.util.ArrayList;

public class Team {
    private String name;
    private String description;
    private Member member;
    private static ArrayList<Team> instances = new ArrayList<>();
    private int memberId;
    public Team(String name, String description, Member member){
        this.name = name;
        this.description = description;
        this.member = member;
        instances.add(this);
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

    public Member getMember(){
        return this.member;
    }

    public int getMemberId(){
        return this.memberId;
    }

    public static ArrayList<Team> getAll(){
        return instances;
    }

    public static Team findById(int teamId){
        return instances.get(teamId-1);
    }

    public void edit(String name, String description, Member member){
        this.name = name;
        this.description = description;
        this.member = member;

    }


    }



