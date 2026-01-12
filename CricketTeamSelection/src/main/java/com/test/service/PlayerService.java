package com.test.service;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.PlayerDao;
import com.test.model.Player;
@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<Player> getFinalTeam() {

        Set<Player> team = new LinkedHashSet<>();

        team.addAll(playerDao.getTopScorers());
        team.addAll(playerDao.getBestBattingAvg());
        team.addAll(playerDao.getBestBowlingAvg());

        return new ArrayList<>(team).subList(0, Math.min(team.size(), 15));
    }
}
