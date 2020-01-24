package com.imhotek.EmeraldeGardensEnrollment.model;

import java.time.LocalDate;

public interface Client extends Model {

    String getFirstName();
    String getLastName();
    LocalDate getBirthDate();


}
