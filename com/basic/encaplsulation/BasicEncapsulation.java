package com.basic.encaplsulation;
class Student {
    private int id;
    private String name;// instance

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(this.name.equalsIgnoreCase("admin")){
            this.id = id;
        }else{
            System.out.println("permission denied");
        }
    }
}

public class BasicEncapsulation {
    public static void main(String[] args) {
        Student omkar = new Student(10, "Omkar");
        Student admin = new Student(11, "admin");
        omkar.setId(20);
        admin.setId(100);
        System.out.println(admin.getId());
    }
}
