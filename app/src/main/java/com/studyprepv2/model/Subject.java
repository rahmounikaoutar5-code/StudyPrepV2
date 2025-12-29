package com.studyprepv2.model;

/**
 * Représente une matière à réviser
 */
public class Subject {

    private int id;
    private String name;
    private String examDate;
    private int difficulty; // 1 = facile, 5 = difficile

    public Subject(int id, String name, String examDate, int difficulty) {
        this.id = id;
        this.name = name;
        this.examDate = examDate;
        this.difficulty = difficulty;
    }

    public int getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
