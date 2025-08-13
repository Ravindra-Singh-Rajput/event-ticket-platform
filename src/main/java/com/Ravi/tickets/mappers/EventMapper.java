package com.Ravi.tickets.mappers;

import com.Ravi.tickets.domain.CreateEventRequest;
import com.Ravi.tickets.domain.CreateTicketTypeRequest;
import com.Ravi.tickets.domain.UpdateEventRequest;
import com.Ravi.tickets.domain.UpdateTicketTypeRequest;
import com.Ravi.tickets.domain.dtos.CreateEventRequestDto;
import com.Ravi.tickets.domain.dtos.CreateEventResponseDto;
import com.Ravi.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.Ravi.tickets.domain.dtos.GetEventDetailsResponseDto;
import com.Ravi.tickets.domain.dtos.GetEventDetailsTicketTypesResponseDto;
import com.Ravi.tickets.domain.dtos.GetPublishedEventDetailsResponseDto;
import com.Ravi.tickets.domain.dtos.GetPublishedEventDetailsTicketTypesResponseDto;
import com.Ravi.tickets.domain.dtos.ListEventResponseDto;
import com.Ravi.tickets.domain.dtos.ListEventTicketTypeResponseDto;
import com.Ravi.tickets.domain.dtos.ListPublishedEventResponseDto;
import com.Ravi.tickets.domain.dtos.UpdateEventRequestDto;
import com.Ravi.tickets.domain.dtos.UpdateEventResponseDto;
import com.Ravi.tickets.domain.dtos.UpdateTicketTypeRequestDto;
import com.Ravi.tickets.domain.dtos.UpdateTicketTypeResponseDto;
import com.Ravi.tickets.domain.entities.Event;
import com.Ravi.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

  CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

  CreateEventRequest fromDto(CreateEventRequestDto dto);

  CreateEventResponseDto toDto(Event event);

  ListEventTicketTypeResponseDto toDto(TicketType ticketType);

  ListEventResponseDto toListEventResponseDto(Event event);

  GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(
      TicketType ticketType);

  GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);

  UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);

  UpdateEventRequest fromDto(UpdateEventRequestDto dto);

  UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType);

  UpdateEventResponseDto toUpdateEventResponseDto(Event event);

  ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event);

  GetPublishedEventDetailsTicketTypesResponseDto toGetPublishedEventDetailsTicketTypesResponseDto(
      TicketType ticketType);

  GetPublishedEventDetailsResponseDto toGetPublishedEventDetailsResponseDto(Event event);
}
