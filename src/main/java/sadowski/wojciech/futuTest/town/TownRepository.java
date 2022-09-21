package sadowski.wojciech.futuTest.town;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TownRepository {
    private JdbcTemplate jdbcTemplate;

    public TownRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Town town) {
        jdbcTemplate.update("INSERT INTO TOWNS(NAME) VALUES ?", town.getName());
    }

    public List<Town> selectAll() {
        return jdbcTemplate.query("SELECT * FROM TOWNS",
                BeanPropertyRowMapper.newInstance(Town.class));
    }

    public Town select(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM TOWNS WHERE ID = ?",
                BeanPropertyRowMapper.newInstance(Town.class), id);
    }

    public void update(Town town) {
        jdbcTemplate.update("UPDATE TOWNS SET NAME = ? WHERE ID = ?", town.getName(), town.getId());
    }

    public void delete(Town town) {
        jdbcTemplate.update("DELETE FROM TOWNS WHERE ID = ?", town.getId());
    }
}
