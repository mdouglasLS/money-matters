package com.moneymatters.controllers;

import com.moneymatters.dtos.WalletDto;
import com.moneymatters.models.Wallet;
import com.moneymatters.services.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("wallets")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping
    public List<Wallet> findAll() {
        return walletService.findAll();
    }

    @GetMapping("/{id}")
    public Wallet findById(@PathVariable("id") Long id) {
        return walletService.findById(id);
    }

    @PostMapping
    public Wallet store(@RequestBody WalletDto walletDto) {
        return walletService.store(walletDto);
    }

    @PutMapping("/{id}")
    public Wallet update(@PathVariable("id") Long id, @RequestBody WalletDto walletDto) {
        return walletService.update(id, walletDto);
    }

}
