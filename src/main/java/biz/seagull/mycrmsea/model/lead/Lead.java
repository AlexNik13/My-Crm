package biz.seagull.mycrmsea.model.lead;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "leads")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String leadName;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "url_site")
    private String urlSite;

    private String city;

    @Column(name = "data_registration")
    private LocalDateTime dataRegistration;

    @Column(name = "comment_client")
    @Lob
    private String commentClient;

    @Column(name = "note_manager")
    @Lob
    private String noteManager;

    @Enumerated(value = EnumType.STRING)
    private LeadStatus leadStatus;

}
