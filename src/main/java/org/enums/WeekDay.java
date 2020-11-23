package org.enums;

public enum WeekDay {

    MONDAY("8.00 -17:00")
    ,TUESDAY("8.00 -17:00"),
    WEDNESDAY("8.00 -17:00"),
    THURSDAY("8.00 -17:00"),
    FRIDAY ("8.00 -17:00")
    ,SATURDAY ("Closed"),
    SUNDAY ("Closed");

    private String openingHours;

    WeekDay(String openingHours) {
        this.openingHours = openingHours;
    }
    public String getOpeningHours(){
        return this.openingHours;
    }
    public void setOpeningHours(String openingHours){
        this.openingHours = openingHours;
    }
}
