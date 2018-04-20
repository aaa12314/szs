package com.gds.szs.szs.repository;

import com.gds.szs.szs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbc;

    public void insert(User user) {
        jdbc.update("insert into user " +
                         "(username, sex) " +
                         "values (?, ?)",
                          user.username, user.sex);
    }

    public List<User> getUser() {
        return jdbc.query("select * from user",
                new RowMapper<User>() {
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setId(rs.getLong(1));
                        user.setUsername(rs.getString(2));
                        user.setSex(rs.getString(3));
                        return user;
                    }
                });
    }
}
