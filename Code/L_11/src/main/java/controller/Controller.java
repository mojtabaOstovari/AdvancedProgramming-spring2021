package controller;

import db.Context;

public class Controller {
    protected Context context;
    public Controller(){
        context = new Context();
    }
}
