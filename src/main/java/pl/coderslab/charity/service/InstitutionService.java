package pl.coderslab.charity.service;


import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;

import java.util.List;


public interface InstitutionService {

    List<Institution> findAllInstitutions();
}
