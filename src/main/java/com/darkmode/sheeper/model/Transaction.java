package com.darkmode.sheeper.model;

import lombok.*;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Transaction extends BaseEntity {

    private double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
