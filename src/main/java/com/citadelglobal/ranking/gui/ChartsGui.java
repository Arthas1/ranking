package com.citadelglobal.ranking.gui;

import com.citadelglobal.ranking.entity.CitadelRanking;
import com.citadelglobal.ranking.repo.UserRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
@Route("globalranking")

public class ChartsGui extends VerticalLayout {

    @Autowired

    private UserRepository userRepository;


    public ChartsGui(UserRepository userRepository) {


        Label labelTop = new Label("Top");
        Label labelStatus = new Label("Status");
        Label labelName = new Label("Players name");
        Label labelScore = new Label("Score");
        Label labelKillsResult = new Label("Kills");
        Label labelDeathsResult = new Label("Deaths");
        Label labelLastActive = new Label("Recently");



        TextField textFieldUser = new TextField("Podaj uzytkownika");

        Button button = new Button("Click");
        button.addClickListener(clickEvent -> {
        CitadelRanking citadelRanking = new CitadelRanking(textFieldUser.getValue(),"123",0, 0, 0, LocalDate.now(),LocalDate.now(), LocalDate.now(), 0, 0);
            userRepository.save(citadelRanking);

        });
        StringBuilder response = new StringBuilder();

            HorizontalLayout hl1 = new HorizontalLayout();
        hl1.add(textFieldUser, button);
          //  hl1.add(labelTop, labelStatus, labelName, labelScore, labelKillsResult, labelDeathsResult, labelLastActive);
        add(hl1);
    }
}