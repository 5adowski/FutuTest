package sadowski.wojciech.futuTest.campaign;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class CampaignController {
    private CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping("/campaigns")
    public List<Campaign> getAll(){
        return campaignService.readAll();
    }
    @GetMapping("/campaign/{id}")
    public Campaign get(@PathVariable Long id){
        return campaignService.read(id);
    }

    @PostMapping(value = ("/campaign"),
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Campaign> post(@Valid @RequestBody Campaign campaign) {
        campaignService.create(campaign);
        return ResponseEntity.created(URI.create("/")).body(campaign);
    }
}
