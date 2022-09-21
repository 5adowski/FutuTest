package sadowski.wojciech.futuTest.town;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownService {
    private TownRepository townRepository;

    public TownService(TownRepository townRepository) {
        this.townRepository = townRepository;
    }

    public void create(Town town) {
        townRepository.insert(town);
    }

    public List<Town> readAll() {
        return townRepository.selectAll();
    }

    public List<String> readAllNames() {
        return townRepository.selectAll().stream().map(Town::getName).toList();
    }

    public Town read(Long id) {
        return townRepository.select(id);
    }

    public String readName(Long id) {
        return townRepository.select(id).getName();
    }

    public void update(Town town) {
        townRepository.update(town);
    }

    public void delete(Town town) {
        townRepository.delete(town);
    }
}
