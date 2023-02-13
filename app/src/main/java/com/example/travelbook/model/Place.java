package com.example.travelbook.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Place {

        @PrimaryKey(autoGenerate = true)
        public int id;

        @ColumnInfo(name = "name ")
        public String name;

        @ColumnInfo(name = "latitude")
        public double latitude;

        @ColumnInfo(name="Longitude")
        public Double longitude;


        public Place(String name, Double latitude, Double longitude){

            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }


}
