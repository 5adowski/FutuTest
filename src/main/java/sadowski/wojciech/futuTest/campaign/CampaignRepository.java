package sadowski.wojciech.futuTest.campaign;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CampaignRepository {
    private JdbcTemplate jdbcTemplate;

    public CampaignRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Campaign campaign) {
        jdbcTemplate.update("INSERT INTO CAMPAIGNS(NAME, KEY_WORDS, BID, FUND, STATUS, TOWN, RADUIS)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)",
                campaign.getName(),
                campaign.getKeyWords(),
                campaign.getBid(),
                campaign.getFund(),
                campaign.getStatus(),
                campaign.getTown(),
                campaign.getRadius());
    }

    public List<Campaign> selectAll() {
        return jdbcTemplate.query("SELECT * FROM CAMPAIGNS",
                BeanPropertyRowMapper.newInstance(Campaign.class));
    }
    public Campaign select(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM CAMPAIGNS WHERE id = ?",
                BeanPropertyRowMapper.newInstance(Campaign.class), id);
    }

    public void update(Campaign campaign) {
        jdbcTemplate.update("UPDATE CAMPAIGNS SET NAME = ?, KEY_WORDS = ?, BID = ?, FUND = ?, STATUS = ?, TOWN = ?, RADIUS = ? WHERE ID = ?",
                campaign.getName(),
                campaign.getKeyWords(),
                campaign.getBid(),
                campaign.getFund(),
                campaign.getStatus(),
                campaign.getTown(),
                campaign.getRadius(),
                campaign.getId());
    }

    public void delete(Campaign campaign) {
        jdbcTemplate.update("DELETE FROM CAMPAINGS WHERE ID = ?", campaign.getId());
    }

}
