package com.topicos.dois.controller;

import com.topicos.dois.dto.request.AgendaRequestDTO;
import com.topicos.dois.dto.response.AgendaResponseDTO;
import com.topicos.dois.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/agenda")
@RequiredArgsConstructor
public class AgendaController {

    private final AgendaService agendaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AgendaResponseDTO> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(agendaService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<AgendaResponseDTO>> findAll() {
        return ResponseEntity.ok().body(agendaService.findAll());
    }

    @PostMapping
    public ResponseEntity<AgendaResponseDTO> register(@RequestBody AgendaRequestDTO agendaRequestDTO, UriComponentsBuilder uriBuilder) {

        AgendaResponseDTO agendaResponseDTO = agendaService.register(agendaRequestDTO);

        URI uri = uriBuilder.path("/agenda/{id}").buildAndExpand(agendaResponseDTO.getId()).toUri();

      return ResponseEntity.created(uri).body(agendaResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<AgendaResponseDTO> update(@RequestBody AgendaRequestDTO agendaDTO, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(agendaService.update(id,agendaDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(agendaService.delete(id));
    }

}
