package com.avwaveaf.cardsservice.mapper;

import com.avwaveaf.cardsservice.dto.CardsDTO;
import com.avwaveaf.cardsservice.entity.Cards;

public class CardMapper {
    public static CardsDTO toDTO(Cards cards) {
        return CardsDTO.builder()
                .mobileNumber(cards.getMobileNumber())
                .cardType(cards.getCardType())
                .totalLimit(cards.getTotalLimit())
                .cardNumber(cards.getCardNumber())
                .availableAmount(cards.getAvailableAmount())
                .amountUsed(cards.getAmountUsed())
                .build();
    }
}
