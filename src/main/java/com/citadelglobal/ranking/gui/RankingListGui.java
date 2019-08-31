package com.citadelglobal.ranking.gui;

import com.citadelglobal.ranking.entity.CitadelRanking;
import com.citadelglobal.ranking.repo.UserRepository;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
@StyleSheet("/styles.css")
@Route("view-score-now")
public class RankingListGui extends VerticalLayout {
    private Grid<CitadelRanking> citadelRankingGrid = new Grid<>(CitadelRanking.class);
    @Autowired
    public RankingListGui(UserRepository userRepository){
        citadelRankingGrid.setItems(userRepository.findByScore());
        citadelRankingGrid.setColumns("user", "score");
        HorizontalLayout hl = new HorizontalLayout();
        hl.setSizeFull();
        hl.add(citadelRankingGrid);
        add(hl);
    }
}

