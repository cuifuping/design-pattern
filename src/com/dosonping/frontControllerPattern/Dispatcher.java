package com.dosonping.frontControllerPattern;
//创建调度器Dispatcher
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatcher(String request) {
        if(request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        }else {
            homeView.show();
        }
    }
}
