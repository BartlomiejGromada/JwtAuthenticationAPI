package pl.gromada.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.gromada.api.entity.EsportPlayer;
import pl.gromada.api.entity.Game;
import pl.gromada.api.repository.EsportPlayerRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;


@Service
public class EsportPlayerService {

    private final EsportPlayerRepository esportPlayerRepository;

    @Autowired
    public EsportPlayerService(EsportPlayerRepository esportPlayerRepository) {
        this.esportPlayerRepository = esportPlayerRepository;
    }

    public Page<EsportPlayer> findAllEsportPlayers(Pageable pageable) {
        return esportPlayerRepository.findAll(pageable);
    }

    public EsportPlayer findEsportPlayerById(Long id) {
        return esportPlayerRepository.findById(id)
                .orElseThrow(IllegalStateException::new);
    }

    public void deleteEsportPlayerById(Long id) {
        EsportPlayer esportPlayer = this.findEsportPlayerById(id);
        if (esportPlayer != null)
            esportPlayerRepository.delete(esportPlayer);
    }

    public EsportPlayer saveEsportPlayer(EsportPlayer esportPlayer) {
        return esportPlayerRepository.save(esportPlayer);
    }

    public void updateEsportPlayer(Long id, EsportPlayer esportPlayer) {
        EsportPlayer esportPlayerFound = this.findEsportPlayerById(id);
        if (esportPlayer != null) {
            esportPlayer.setId(id);
            esportPlayerRepository.save(esportPlayer);
        }
    }

    @PostConstruct
    public void initDatabase() {
        esportPlayerRepository.saveAll(Arrays.asList(
                new EsportPlayer(1L, "Marcin", "Jankowski",
                        "Jankos", Game.LOL, "G2 Esport"),
                new EsportPlayer(2L, "Adam", "Kowalski",
                        "Kowal", Game.FIFA, "Lech Poznań"),
                new EsportPlayer(3L, "Janusz", "Pogorzelski",
                        "Snax", Game.CSGO, "Anonymous Esport")
        ));
    }

}
