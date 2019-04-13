package com.example.twentyone.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PointsItem {

    private Date date;
    private boolean exercise;
    private boolean eat;
    private boolean drink;
    private String notes;
    private String user;


    public PointsItem() {

    }

    public PointsItem(String date, Integer exercise, Integer eat, Integer drink, String notes, String user) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        try {
            fecha = format.parse (date);
            this.date = fecha;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (fecha == null) {
            this.date = new Date();
        }
        this.exercise = false;
        if (exercise == 1) this.exercise = true;
        this.eat = false;
        if (eat == 1) this.eat = true;
        this.drink = false;
        if (drink == 1) this.drink = true;
        this.notes = notes;
        this.user = user;
    }

    public PointsItem(Date date, boolean exercise, boolean eat, boolean drink, String notes, String user) {
        this.date = date;
        this.exercise = exercise;
        this.eat = eat;
        this.drink = drink;
        this.notes = notes;
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isExercise() {
        return exercise;
    }

    public void setExercise(boolean exercise) {
        this.exercise = exercise;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static ArrayList<PointsItem> getData() {
        ArrayList<PointsItem> pointsList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            PointsItem points = new PointsItem();
            points.setDate(new Date());
            points.setNotes("Note " + i);
            pointsList.add(points);
        }

        return pointsList;
    }

    public static ArrayList<PointsItem> getData2() {
        ArrayList<PointsItem> pointsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            PointsItem points = new PointsItem();
            points.setDate(new Date());
            points.setNotes("Note " + i);
            pointsList.add(points);
        }

        return pointsList;
    }

    @Override
    public String toString() {
        return "PointsItem{" +
                "date=" + date +
                ", exercise=" + exercise +
                ", eat=" + eat +
                ", drink=" + drink +
                ", notes='" + notes + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
