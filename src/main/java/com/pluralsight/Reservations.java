package com.pluralsight;

    public class Reservations {
        private String roomType;
        private double price;
        private int numberOfNights;
        private boolean isWeekend;
        private String reservationTotal;


        public Reservations(String roomType, double price, int  numberOfNights, boolean isWeekend, String reservationTotal){
            this.roomType = roomType;
            this.price = price;
            this.numberOfNights = numberOfNights;
            this.isWeekend = isWeekend;
            this.reservationTotal = this.reservationTotal;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }
        public double getPrice() {
            return price;
        }
        public int getNumberOfNights() {
            return numberOfNights;
        }
        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }
        public boolean getIsWeekend() {
            return isWeekend;
        }
        public void setIsWeekend(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
        public String getReservationTotal() {
            return reservationTotal;
        }
        public void setReservationTotal(String reservationTotal){
            this.reservationTotal = reservationTotal;
        }
}
