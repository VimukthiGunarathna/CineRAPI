package com.vimma.ciner.dao;

import com.vimma.ciner.models.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotDao extends JpaRepository<TimeSlot, Integer> {
}
