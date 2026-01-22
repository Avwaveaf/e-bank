package com.avwaveaf.cardsservice.service.handler;

import com.avwaveaf.cardsservice.entity.Cards;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class CardGenerationHandler {

    private static final SecureRandom RANDOM = new SecureRandom();

    public Cards generateNewCard(String mobileNumber) {
        String cardNumber = generateCardNumber();
        String cardType = determineCardType();
        long totalLimit = calculateTotalLimit(cardType);

        return Cards.builder()
                .mobileNumber(mobileNumber)
                .cardNumber(cardNumber)
                .cardType(cardType)
                .totalLimit(totalLimit)
                .amountUsed(0L)
                .availableAmount(totalLimit)
                .build();
    }

    private String generateCardNumber() {
        // 16-digit card number (not Luhn yet, but structured)
        StringBuilder sb = new StringBuilder("4"); // Visa-like prefix
        for (int i = 0; i < 15; i++) {
            sb.append(RANDOM.nextInt(10));
        }
        return sb.toString();
    }

    private String determineCardType() {
        // Simple rule now, extensible later
        return "VISA_CLASSIC";
    }

    private long calculateTotalLimit(String cardType) {
        return switch (cardType) {
            case "VISA_GOLD" -> 50_000_000L;
            case "VISA_PLATINUM" -> 100_000_000L;
            default -> 10_000_000L;
        };
    }
}