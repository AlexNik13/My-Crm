package biz.seagull.mycrmsea.dto.lead;

import biz.seagull.mycrmsea.model.lead.LeadStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class LeadResponseDto {
    private Long id;
    private String leadName;
    private String name;
    private String phoneNumber;
    private String urlSite;
    private String city;
    private LocalDateTime dataRegistration;
    private String commentClient;
    private String noteManager;
    private LeadStatus leadStatus;
}
