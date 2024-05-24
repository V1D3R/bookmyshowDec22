package com.scaler.bookmyshowdec22.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows") // Show is a keyword in MySQL, so need to specify (name = "shows") to be used as a Table name.
public class Show extends BaseModel{
    // 1 : 1
    // M : 1
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

}
