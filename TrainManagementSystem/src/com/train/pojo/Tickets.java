package com.train.pojo;




public class Tickets {

 

private int trainno;    
private int ticketno;
private String pname;
private String reservationtype;
private double ticketprice;
public int getTrainno() {
    return trainno;
}
public void setTrainno(int trainno) {
    this.trainno = trainno;
}
public int getTicketno() {
    return ticketno;
}
public void setTicketno(int ticketno) {
    this.ticketno = ticketno;
}
public String getPname() {
    return pname;
}
public void setPname(String pname) {
    this.pname = pname;
}
public String getReservationtype() {
    return reservationtype;
}
public void setReservationtype(String reservationtype) {
    this.reservationtype = reservationtype;
}
public double getTicketprice() {
    return ticketprice;
}
public void setTicketprice(double ticketprice) {
    this.ticketprice = ticketprice;
}
public Tickets(int trainno, int ticketno, String pname, String reservationtype, double ticketprice) {
    super();
    this.trainno = trainno;
    this.ticketno = ticketno;
    this.pname = pname;
    this.reservationtype = reservationtype;
    this.ticketprice = ticketprice;
}
public Tickets() {
    super();
    // TODO Auto-generated constructor stub
}

 


}
