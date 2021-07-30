package br.com.gabriel.aula.conceitos.tratamentoDeExcecoes.entities;

import br.com.gabriel.aula.conceitos.tratamentoDeExcecoes.entities.exeptions.DomainException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Reservation(final Integer roomNumber, final Date checkin, final Date checkout) {
    this.roomNumber = roomNumber;
    this.checkIn = checkin;
    this.checkOut = checkout;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(final Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Date getCheckin() {
    return checkIn;
  }

  public Date getCheckout() {
    return checkOut;
  }

  public long duration() {
    long time = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(time, TimeUnit.MICROSECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut) {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new DomainException("Reservation dates for update must be future dates");
    }
    if (!checkOut.after(checkIn)) {
      throw new DomainException("Check-out date must be after check-in date");
    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }
  @Override
  public String toString() {
    return "Room "
        + roomNumber
        + ", check-in: "
        + sdf.format(checkIn)
        + ", check-out: "
        + sdf.format(checkOut)
        + ", "
        + duration()
        + " nights";
  }
}
