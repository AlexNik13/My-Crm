package biz.seagull.mycrmsea.dto.lead;

import biz.seagull.mycrmsea.model.lead.LeadStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LeadRequestDto {
    private String leadName;
    private String name;
    private String phoneNumber;
    private String city;
    private String commentClient;
}
