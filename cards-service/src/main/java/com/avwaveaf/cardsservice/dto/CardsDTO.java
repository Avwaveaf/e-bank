package com.avwaveaf.cardsservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;
import lombok.Data;

@Data
@Schema(
        name = "Cards",
        description = "Cards Schema Detail Information"
)
@Builder
public class CardsDTO {
    @NotEmpty(message = "Mobile Number cannot be empty" )
    @Pattern(regexp = "^[0-9]{12}$", message = "Invalid Mobile Number")
    @Schema(description = "Customer Mobile Number", examples = "1234567890")
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be empty")
    @Pattern(regexp = "^[0-9]{16}$", message = "Invalid Card Number")
    @Schema(
            description = "Card number of a customer", examples = "100646930341"
    )
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be empty")
    @Schema(description = "Card Type of a customer", examples = "Visa")
    private String cardType;

    @PositiveOrZero(message = "Total Limit cannot be negative")
    @Schema(description = "Total Limit of a customer", examples = "10000")
    private Long totalLimit;

    @PositiveOrZero(message = "Amount Used cannot be negative")
    @Schema(description = "Amount Used of a customer", examples = "1000")
    private Long amountUsed;

    @PositiveOrZero(message = "Available Amount cannot be negative")
    @Schema(description = "Available Amount of a customer", examples = "9000")
    private Long availableAmount;
}
