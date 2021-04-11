package pl.gromada.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pl.gromada.api.entity.EsportPlayer;
import pl.gromada.api.service.EsportPlayerService;

@RestController
@RequestMapping("/api/v1/esportPlayers")
public class EsportController {

    private final EsportPlayerService esportPlayerService;

    @Autowired
    public EsportController(EsportPlayerService esportPlayerService) {
        this.esportPlayerService = esportPlayerService;
    }

    @GetMapping("/")
    public Page<EsportPlayer> findAllEsportPlayers(Pageable pageable) {
        return esportPlayerService.findAllEsportPlayers(pageable);
    }

    @GetMapping("/{id}")
    public EsportPlayer findEsportPlayerById(@PathVariable("id") Long id) {
        return esportPlayerService.findEsportPlayerById(id);
    }

    @PostMapping("/")
    public EsportPlayer saveEsportPLayer(@RequestBody EsportPlayer esportPlayer) {
        return esportPlayerService.saveEsportPlayer(esportPlayer);
    }

    @PutMapping("/{id}")
    public void updateEsportPlayer(@PathVariable("id") Long id, @RequestBody EsportPlayer esportPlayer) {
        esportPlayerService.updateEsportPlayer(id, esportPlayer);
    }

    @DeleteMapping("/{id}")
    public void deleteEsportPlayerById(@PathVariable("id") Long id) {
        esportPlayerService.deleteEsportPlayerById(id);
    }


}
