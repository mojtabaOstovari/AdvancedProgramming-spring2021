package controller;

import apps.authentication.model.Profile;
import apps.authentication.model.User;

public class Context {
    public DBSet<User> Users = new UserDB();
    public DBSet<Profile> Profiles = new ProfileDB();




}
