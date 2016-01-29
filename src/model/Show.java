package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Show {
    private int movieID;
    private int cinemaID;
    private int hallID;
    private ArrayList<Hall> halls;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private ArrayList<LocalTime> seancesTime;
    private String price;
    private boolean is3D;


}
