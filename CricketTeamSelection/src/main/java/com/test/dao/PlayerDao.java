package com.test.dao;
import com.test.model.Player;
import com.test.model.PlayerRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Player> getTopScorers() {
        String sql = "SELECT p.player_id, p.player_name, p.state," +
                     "b.total_runs, b.avg_score, bw.bowling_avg " +
                     "FROM players p " +
                     "JOIN batting_stats b ON p.player_id=b.player_id " +
                     "JOIN bowling_stats bw ON p.player_id=bw.player_id " +
                     "ORDER BY b.total_runs DESC LIMIT 5";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }

    public List<Player> getBestBattingAvg() {
        String sql = "SELECT p.player_id, p.player_name, p.state," +
                     "b.total_runs, b.avg_score, bw.bowling_avg " +
                     "FROM players p " +
                     "JOIN batting_stats b ON p.player_id=b.player_id " +
                     "JOIN bowling_stats bw ON p.player_id=bw.player_id " +
                     "ORDER BY b.avg_score DESC LIMIT 5";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }

    public List<Player> getBestBowlingAvg() {
        String sql = "SELECT p.player_id, p.player_name, p.state," +
                     "b.total_runs, b.avg_score, bw.bowling_avg " +
                     "FROM players p " +
                     "JOIN batting_stats b ON p.player_id=b.player_id " +
                     "JOIN bowling_stats bw ON p.player_id=bw.player_id " +
                     "ORDER BY bw.bowling_avg ASC LIMIT 5";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }
}
