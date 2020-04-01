package com.example.jeffscottresume.data;

import com.example.jeffscottresume.model.ModelProject;

import java.util.ArrayList;
import java.util.List;

public class DataProject {
    public static List<ModelProject> getDataProjects() {
        List<ModelProject> projects = new ArrayList<>();

        ModelProject project1 		= new ModelProject();
        project1.projectName 		= ("Blues Website");
        project1.projectType 		= ("Website");
        project1.projectDescription = ("Website for St. Louis Blues 2019 Season");
        project1.projectImagePath	= ("project01-slb");
        project1.projectLandingPage	= ("https://github.com/jpscottranken/Blues.git");
        projects.add(project1);

        ModelProject project2 		= new ModelProject();
        project2.projectName 		= ("C# Magic 8 Ball Program");
        project2.projectType 		= ("C# Game");
        project2.projectDescription = ("C# Program Mimicing Magic 8 Ball Game");
        project2.projectImagePath	= ("project02-m8b");
        project2.projectLandingPage	= ("https://github.com/jpscottranken/Magic8Ball.git");
        projects.add(project2);

        ModelProject project3 		= new ModelProject();
        project3.projectName		= ("SportsStore ASP.NET Project");
        project3.projectType 		= ("ASP.NET Application");
        project3.projectDescription = ("ASP.NET Database-Driven Website");
        project3.projectImagePath	= ("project03-ss");
        project3.projectLandingPage	= ("https://github.com/jpscottranken/SportsStore.git");
        projects.add(project3);

        ModelProject project4 		= new ModelProject();
        project4.projectName		= ("Java Android RecyclerView Example");
        project4.projectType 		= ("Java Android");
        project4.projectDescription = ("Java Android App Demoing Android RecyclerView");
        project4.projectImagePath 	= ("project04-rv");
        project4.projectLandingPage	= ("https://github.com/jpscottranken/RVExample.git");
        projects.add(project4);

        return projects;
    }
}