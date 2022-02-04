package com.company;

public class Попугай {
    private String аты;
    private String түрү;
    private int сөзБайлыгы;
    private int орточоЖашамы;
    private String кызыктууФакт;

    public void setАты(String аты) {
        if (аты.isEmpty()) {
            System.out.println("Боштукту толтурунуз!");
        } else {
            this.аты = аты;
        }
    }

    public String getАты() {
        return аты;
    }

    public void setТүрү(String түрү) {

        if (түрү.isEmpty()) {
            System.out.println("Боштукту толтурунуз!");
        } else {
            this.түрү = түрү;
        }
    }

    public String getТүрү() {
        return түрү;
    }

    public void setсөзБайлыгы(int сөзБайлыгы) {

        if (сөзБайлыгы<0) {
            System.out.println("Боштукту толтурунуз!");
        } else {
            this.сөзБайлыгы = сөзБайлыгы;
        }
    }

    public int getсөзБайлыгы() {
        return сөзБайлыгы;
    }

    public void setОрточоЖашамы(int орточоЖашамы) {

        if (орточоЖашамы < 0) {
            System.out.println("Oң сан менен толтурунуз!");
        } else {
            this.орточоЖашамы = орточоЖашамы;
        }
    }

    public int getОрточоЖашамы() {
        return орточоЖашамы;
    }

    public void setКызыктууФакт(String кызыктууФакт) {

        if (кызыктууФакт.isEmpty()) {
            System.out.println("Боштукту толтурунуз!");
        } else {
            this.кызыктууФакт = кызыктууФакт;
        }
    }

    public String getКызыктууФакт() {
        return кызыктууФакт;
    }
    public void Console(){
        System.out.println(аты + "\n" + түрү + "\n" + сөзБайлыгы + " сөз билет." + "\n" + орточоЖашамы +
                " жыл жашайт" + "\n" + кызыктууФакт + "\n");
    }

}
