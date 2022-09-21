package sadowski.wojciech.futuTest.town;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TownController {
    private TownService townService;

    public TownController(TownService townService) {
        this.townService = townService;
    }

    @GetMapping("/towns")
    public List<String> getAllNames(){
        return townService.readAllNames();
    }

    @GetMapping("/town/{id}")
    public String getName(@PathVariable Long id){
        return townService.readName(id);
    }
}
