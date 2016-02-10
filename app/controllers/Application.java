package controllers;

import play.jobs.OnApplicationStart;
import play.mvc.Controller;

@OnApplicationStart
public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void sayHello(String myName) {
        render(myName);
    }

}