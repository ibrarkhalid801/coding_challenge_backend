package com.backend.codingchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class RewardService {
    public int calculateRewardPoints(double amount) {
        int points = 0;
        if (amount > 100) {
            points += 2 * (int)(amount - 100);
            amount = 100;
        }
        if (amount > 50) {
            points += (int)(amount - 50);
        }
        return points;
    }
}