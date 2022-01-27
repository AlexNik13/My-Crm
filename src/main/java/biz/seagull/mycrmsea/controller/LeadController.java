package biz.seagull.mycrmsea.controller;


import biz.seagull.mycrmsea.dto.lead.LeadRequestDto;
import biz.seagull.mycrmsea.dto.lead.LeadResponseDto;
import biz.seagull.mycrmsea.mapper.LeadMapper;
import biz.seagull.mycrmsea.model.lead.Lead;
import biz.seagull.mycrmsea.service.LeadService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @PostMapping("/creates")
    public LeadResponseDto createLead(@RequestBody LeadRequestDto dto){
        Lead lead =  leadService.createLead(dto);
        return LeadMapper.toLeadResponseDto(lead);
    }

    @GetMapping
    public Page<LeadResponseDto> getAllLead(Pageable page){
        Page<Lead> leads = leadService.getAllLead(page);
        return leads.map(LeadMapper::toLeadResponseDto);
    }

}
