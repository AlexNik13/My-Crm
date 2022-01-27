package biz.seagull.mycrmsea.model;

import biz.seagull.mycrmsea.model.lead.Lead;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstname;
  private String lastname;

  @Column(name = "phone_number")
  private String phoneNumber;

  private String city;

  @Column(name = "create_at")
  private LocalDateTime createAt;

  @Column(name = "note_manager")
  @Lob
  private String noteManager;

  @OneToOne
  private Lead lead;

}
