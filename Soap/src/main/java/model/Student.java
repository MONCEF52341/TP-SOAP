package model;

public class Student {
    private int id;
    private String nom;
    private String prenom;
    private String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGenre() {
        return genre;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Student(int id, String nom, String prenom, String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
    }
}
