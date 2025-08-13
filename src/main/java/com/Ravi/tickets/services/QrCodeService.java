package com.Ravi.tickets.services;

import com.Ravi.tickets.domain.entities.QrCode;
import com.Ravi.tickets.domain.entities.Ticket;
import java.util.UUID;

public interface QrCodeService {

  QrCode generateQrCode(Ticket ticket);

  byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}
