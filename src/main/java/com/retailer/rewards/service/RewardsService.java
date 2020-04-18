package com.retailer.rewards.service;

import com.retailer.rewards.model.Rewards;



public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
