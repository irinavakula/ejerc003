package es.santander.ascender.ejerc003.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import es.santander.ascender.ejerc003.models.Pen;
import es.santander.ascender.ejerc003.services.PenService;

@RestController
@RequestMapping("/api/pens")
public class PenController {
    @Autowired
    private PenService penService;

    @PostMapping
    public Pen create(@RequestBody Pen pen) {
        return penService.savePen(pen);
    }

    @GetMapping("/{id}")
    public Pen retrive(@PathVariable("id") Long id) {
        return penService.retrievePen(id);
    }

    @PutMapping("/{id}")
    public Pen update(@PathVariable("id") Long id, @RequestBody Pen pen) {
        return penService.updatePen(id, pen);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        penService.deletePen(id);
        return "deleted";
    }

    @GetMapping
    public List<Pen> list() {
        return penService.retrieveAllPens();
    }
}

