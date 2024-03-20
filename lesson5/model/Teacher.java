package model;

public class Teacher {
    private String name;
    private Integer id;

    public Teacher(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " ID-" + id;
    }
}