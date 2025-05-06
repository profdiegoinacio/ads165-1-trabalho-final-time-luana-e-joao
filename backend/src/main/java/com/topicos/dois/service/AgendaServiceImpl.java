package com.topicos.dois.service;

import com.topicos.dois.dto.request.AgendaRequestDTO;
import com.topicos.dois.dto.response.AgendaResponseDTO;
import com.topicos.dois.entity.Agenda;
import com.topicos.dois.repository.AgendaRepository;
import com.topicos.dois.util.AgendaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class AgendaServiceImpl implements AgendaService {

    private final AgendaRepository agendaRepository;

    private final AgendaMapper agendaMapper;


    @Override
    public AgendaResponseDTO findById(Long id) {
     return agendaMapper.toAgendaDTO(returnAgenda(id));
    }

    @Override
    public List<AgendaResponseDTO> findAll() {
        return agendaMapper.toAgendaDTO(agendaRepository.findAll());
    }

    @Override
    public AgendaResponseDTO register(AgendaRequestDTO agendaRequestDTO) {

        Agenda agenda = agendaMapper.toAgenda(agendaRequestDTO);

        return agendaMapper.toAgendaDTO(agendaRepository.save(agenda));
    }

    @Override
    public AgendaResponseDTO update(Long id, AgendaRequestDTO agendaRequestDTO) {

        Agenda agenda = returnAgenda(id);

        agendaMapper.atualizarAgenda(agenda, agendaRequestDTO);

        return agendaMapper.toAgendaDTO(agendaRepository.save(agenda));
    }

    @Override
    public String delete(Long id) {
        agendaRepository.deleteById(id);
        return "Agenda id: "+id+" deleted";
    }

    private Agenda returnAgenda(Long id) {
       return agendaRepository.findById(id)
               .orElseThrow(()-> new RuntimeException("Agenda wasn't fount on database"));
    }

}
