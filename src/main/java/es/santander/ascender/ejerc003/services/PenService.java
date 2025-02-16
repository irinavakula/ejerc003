package es.santander.ascender.ejerc003.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.repositories.PenRepository;
import es.santander.ascender.ejerc003.models.Pen;
import java.util.List;

@Service
public class PenService {

    @Autowired
    private PenRepository penRepository;

    public Pen savePen(Pen pen) {
        return penRepository.save(pen);
    }
    
    public void deletePen(Long id) {
        penRepository.deleteById(id);
    }

    public Pen retrievePen(Long id) {
        return penRepository.findById(id).orElse(null);
    }

    public List<Pen> retrieveAllPens() {
        return penRepository.findAll();
    }

    public Pen updatePen(Long id, Pen pen) {
        if (penRepository.existsById(id)) {
           pen.setId(id);
           return this.savePen(pen);
        }
        throw new RuntimeException("Couldn't find pen with id " + id);
    }

}
