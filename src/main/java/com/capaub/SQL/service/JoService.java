package com.capaub.SQL.service;

import com.capaub.SQL.repository.JoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class JoService {

    private final JoRepository joRepository;

    @Autowired
    public JoService(JoRepository joRepository) {
        this.joRepository = joRepository;
    }

    public List<Map<String, Object>> callSpJoPaysRankedForYear(int year) {
        return joRepository.callSpJoPaysRankedForYear(year);
    }
}
