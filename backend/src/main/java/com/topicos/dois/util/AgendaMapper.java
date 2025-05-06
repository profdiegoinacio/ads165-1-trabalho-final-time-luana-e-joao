package com.topicos.dois.util;

import com.topicos.dois.dto.request.AgendaRequestDTO;
import com.topicos.dois.dto.response.AgendaResponseDTO;
import com.topicos.dois.entity.Agenda;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgendaMapper {

    public Agenda toAgenda(AgendaRequestDTO agendaRequestDTO) {

        return Agenda.builder()
                .dataHora(agendaRequestDTO.getDataHora())
                .nome(agendaRequestDTO.getNome())
                .servico(agendaRequestDTO.getServico())
                .build();

    }

    public AgendaResponseDTO toAgendaDTO(Agenda agenda) {
        return new AgendaResponseDTO(agenda);
    }

    public List<AgendaResponseDTO> toAgendaDTO(List<Agenda> listaDeAgenda) {
        return listaDeAgenda.stream().map(AgendaResponseDTO::new).collect(Collectors.toList());
    }

    public void atualizarAgenda(Agenda agenda, AgendaRequestDTO agendaDTO) {

        agenda.setDataHora(agendaDTO.getDataHora());
        agenda.setNome(agendaDTO.getNome());
        agenda.setServico(agendaDTO.getServico());

    }

}
