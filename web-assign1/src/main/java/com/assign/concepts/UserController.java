package com.assign.concepts;

public class UserController {
 UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
        System.out.println("Setting Using Constructor");
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
        System.out.println("Setting using setter method in order to Inject Dependecy");
    }

    public void control(){
        userService.Coding();
        System.out.println("Majnu control first learn Dsa Now CODE");
 }
}
