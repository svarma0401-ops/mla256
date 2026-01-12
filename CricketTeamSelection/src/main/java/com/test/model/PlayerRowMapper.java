package com.test.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        Player p = new Player();
        p.setPlayerId(rs.getInt("player_id"));
        p.setPlayerName(rs.getString("player_name"));
        p.setState(rs.getString("state"));
        p.setTotalRuns(rs.getInt("total_runs"));
        p.setAvgScore(rs.getDouble("avg_score"));
        p.setBowlingAvg(rs.getDouble("bowling_avg"));
        return p;
    }
}
