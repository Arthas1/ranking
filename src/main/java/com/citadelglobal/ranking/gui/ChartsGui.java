package com.citadelglobal.ranking.gui;

import com.citadelglobal.ranking.entity.citadelranking;
import com.citadelglobal.ranking.repo.UserRepository;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

        HorizontalLayout hl1 = new HorizontalLayout();
        hl1.add(labelTop, labelStatus, labelName, labelScore, labelKillsResult, labelDeathsResult, labelLastActive);



        StringBuilder response = new StringBuilder();


        add(hl1);
    }
}