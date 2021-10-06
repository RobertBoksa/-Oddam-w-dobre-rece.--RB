package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;


public interface DonationService {

    void add(Donation donation);
}
