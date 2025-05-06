package com.topicos.dois.service;


import com.topicos.dois.dto.request.AgendaRequestDTO;
import com.topicos.dois.dto.response.AgendaResponseDTO;

import java.util.List;

public interface AgendaService {

    AgendaResponseDTO findById(Long id);

    List<AgendaResponseDTO> findAll();

    AgendaResponseDTO register(AgendaRequestDTO agendaRequestDTO);

    AgendaResponseDTO update(Long id, AgendaRequestDTO agendaRequestDTO);

    String delete(Long id);

}
