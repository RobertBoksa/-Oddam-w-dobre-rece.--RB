package pl.coderslab.charity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.service.DonationService;

@Controller
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/add")
    @ResponseBody
    public String addDon(){
        Donation donation = new Donation();
        donation.setCity("Kielce");
        donation.setQuantity(5);
        donation.setStreet("Orzeszkowej");
        donationService.add(donation);
        return "created";
    }
}
