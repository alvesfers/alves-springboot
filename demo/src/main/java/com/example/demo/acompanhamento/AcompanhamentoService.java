package com.example.demo.acompanhamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AcompanhamentoService {

    @Autowired
    private AcompanhamentoRepository acompanhamentoRepository;

    public List<Acompanhamento> getAllAcompanhamentos() {
        return acompanhamentoRepository.findAll();
    }

    public Optional<Acompanhamento> getAcompanhamentoById(String id) {
        return acompanhamentoRepository.findById(id);
    }

    public Acompanhamento saveAcompanhamento(Acompanhamento acompanhamento) {
        return acompanhamentoRepository.save(acompanhamento);
    }

    public void deleteAcompanhamento(String id) {
        acompanhamentoRepository.deleteById(id);
    }
}