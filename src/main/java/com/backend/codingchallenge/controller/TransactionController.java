package com.backend.codingchallenge.controller;

import com.backend.codingchallenge.model.Transaction;
import com.backend.codingchallenge.service.RewardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private RewardService rewardService;

    @PostMapping("/calculate-rewards")
    public ResponseEntity<Transaction> calculateRewards(@RequestBody Transaction transaction) {
        double amount = transaction.getAmount();
        int rewardPoints = rewardService.calculateRewardPoints(amount);
        transaction.setRewardPoints(rewardPoints);
        return ResponseEntity.ok(transaction);
    }
}
