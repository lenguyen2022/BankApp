package ca.sheridancollege.lenguyen.bankapp.beans;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ACCOUNT_TYPE")
    private String accountType;
    @Column(name="BALANCE")
    private Double balance;
    @Column(name="BANK_ID")
    private Long bankId;
}
