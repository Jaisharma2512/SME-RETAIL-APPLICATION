package com.example.smemanucollection;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SME.class},version = 1)
public abstract class SMEDatabase extends RoomDatabase {
   public abstract SMEDao smeDao();
}
