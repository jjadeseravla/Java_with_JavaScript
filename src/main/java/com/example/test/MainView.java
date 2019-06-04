package com.example.test;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route //mapped to localhost:8080/
@JavaScript("frontend://script.js")
public class MainView extends Div {

    public MainView() {
        getElement().executeJavaScript("greet($0, $1)","client", getElement());
    }

    @ClientCallable
    public void greet(String name) {
        System.out.println(String.format("Hey, %s!!, this is from the java showing on the interlliJ terminal", name));
    }

}
