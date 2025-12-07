package com.library.entity;

public class Librarian extends User {

    public Librarian() {
        super();
    }

    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public String toString(){
        return "Librarian: "+getName()+" ("+getId()+")";
    }

}
