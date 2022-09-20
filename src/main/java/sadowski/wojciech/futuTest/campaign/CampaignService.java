package sadowski.wojciech.futuTest.campaign;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {
    private CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public void create(Campaign campaign){
        campaignRepository.insert(campaign);
    }

    public List<Campaign> readAll(){
        return campaignRepository.selectAll();
    }
    public Campaign read(Long id) {
        return campaignRepository.select(id);
    }

    public void update(Campaign campaign){
        campaignRepository.update(campaign);
    }

    public void delete(Campaign campaign){
        campaignRepository.delete(campaign);
    }
}
