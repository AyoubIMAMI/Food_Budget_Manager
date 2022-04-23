package etu.polytech.foodbm.model;

import java.util.ArrayList;

import etu.polytech.foodbm.Conso;
import etu.polytech.foodbm.controller.MainPlanDisplayController;

public class MainPlanDisplayModel {
    private MainPlanDisplayController controller;
    private ArrayList<Conso> listPlan;

    public MainPlanDisplayModel(MainPlanDisplayController controller) {
        this.controller = controller;
    }

    public void displayPlan(){
        this.listPlan = new ArrayList<>();

        listPlan.add(new Conso("Conso perso", 100));
        listPlan.add(new Conso("Travail Chine", 100));
        listPlan.add(new Conso("Travail Espagne", 100));
        for(int i= 0 ; i < 20 ; i++)
            listPlan.add(new Conso("Travail Espagne n°"+i, 100+i));

        this.controller.onPlanDisplayed(listPlan);
    }
}