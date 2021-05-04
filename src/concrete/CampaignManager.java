package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" added");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" deleted");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" updated");
    }
}
