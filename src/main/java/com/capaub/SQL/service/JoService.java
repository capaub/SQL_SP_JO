package com.capaub.SQL.service;

import com.capaub.SQL.repository.JoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public String convertListMapToJson(List<Map<String, Object>> list) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(list);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
