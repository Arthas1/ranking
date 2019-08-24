package com.citadelglobal.ranking.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("index")

public class HelloGui extends VerticalLayout {

    public HelloGui() {

        TextField labelField = new TextField("Your Name:");
        Button button = new Button (" Stay valued");
        Label label = new Label();
        button.addClickListener(ClickEvent -> { label.setText ("Hello " + labelField.getValue()) ;
    });
        add(labelField, button, label);
    }
}
