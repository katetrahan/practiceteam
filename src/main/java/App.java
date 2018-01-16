
import models.Team;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");


        //get: show new post form
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show name of input
        get("/team/display", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList teams = Team.getAll();
            model.put("teams", teams);
            return new ModelAndView(model, "team.hbs");
        }, new HandlebarsTemplateEngine());

        //post: process new post form
        post("/team/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
//            ArrayList<String> member= new ArrayList();
            String member1 = req.queryParams("member1");
            String member2 = req.queryParams("member2");
            String member3 = req.queryParams("member3");
            Team.getmInstances().add(member1);
            Team.getmInstances().add(member2);
            Team.getmInstances().add(member3);
//            String first = req.queryParams("first");
//            String last = req.queryParams("last");
//            Member newMember = new Member(first, last);
            String name = req.queryParams("name");
            String description = req.queryParams("description");

            Team newTeam = new Team(name, description,"");
            ArrayList teams = Team.getAll();
            model.put("teams", teams);

            return new ModelAndView(model, "team.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show details about team
        get("/team/:memberId", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToFind = Integer.parseInt(req.params("memberId"));
            Team foundEntry = Team.findById(idOfPostToFind); //find member
            model.put("foundEntry", foundEntry); //add to model for template to display
            return new ModelAndView(model, "details.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show a form to update a post
        get("/team/:memberId/edit", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToEdit = Integer.parseInt(request.params("memberId"));
            Team editTeam = Team.findById(idOfPostToEdit);
            model.put("editTeam", editTeam);
            return new ModelAndView(model, "edit.hbs");
        }, new HandlebarsTemplateEngine());


        //post: process a form to update Team
        post("/team/:memberId/edit", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String description = request.queryParams("description");
//            ArrayList<String> member= new ArrayList();
            String member1 = request.queryParams("member1");
            String member2 = request.queryParams("member2");
            String member3 = request.queryParams("member3");
            Team.getmInstances().add(member1);
            Team.getmInstances().add(member2);
            Team.getmInstances().add(member3);
            int idOfPostToEdit = Integer.parseInt(request.params("memberId"));
            Team foundEntry = Team.findById(idOfPostToEdit);
            foundEntry.edit(name, description, "");
            model.put("foundEntry", foundEntry);
            return new ModelAndView(model, "details.hbs");
        }, new HandlebarsTemplateEngine());


    }

}
