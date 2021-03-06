package com.homework.booking.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * Created By Chae Chul Byung
 */
@Getter
@Builder
public class ReservationDto {
    private Integer slotNo;
    private Integer roomNo;
    private Integer empNo;
}
