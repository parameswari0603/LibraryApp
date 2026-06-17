package org.example.models;


public class Member extends LibraryEntity {
    private String name;
    private String email;

    public Member(int id,
                  String name,
                  String email) {

        super(id);

        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Invalid name");
        if(email == null || email.isBlank())
            throw new IllegalArgumentException("Invalid email");

        this.name = name;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
}