package biz.seagull.mycrmsea.mapper;

import biz.seagull.mycrmsea.dto.lead.LeadResponseDto;
import biz.seagull.mycrmsea.model.lead.Lead;

import java.util.List;
import java.util.stream.Collectors;

public class LeadMapper {

  public static LeadResponseDto toLeadResponseDto(Lead lead) {
    LeadResponseDto dto = new LeadResponseDto();

    dto.setId(lead.getId());
    dto.setLeadName(lead.getLeadName());
    dto.setName(lead.getName());
    dto.setCity(lead.getCity());
    dto.setPhoneNumber(lead.getPhoneNumber());
    dto.setCommentClient(lead.getCommentClient());
    dto.setDataRegistration(lead.getDataRegistration());
    dto.setLeadStatus(lead.getLeadStatus());
    dto.setUrlSite(lead.getUrlSite());
    dto.setNoteManager(lead.getNoteManager());

    return dto;
  }

  public static List<LeadResponseDto> toListLeadResponseDto(List<Lead> leads) {
    return leads.stream()
        .map(LeadMapper::toLeadResponseDto)
        .collect(Collectors.toList());
  }

}
