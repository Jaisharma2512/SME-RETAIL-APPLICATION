package com.example.smemanucollection;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface SMEDao {
    @Query("Select * from Particulars")
    List<SME> getAllParticulars();

    @Insert
    void insertParticular(SME sme);
    @Update
    void updateParticular(SME sme);
    @Delete
    void deleteParticular(SME sme);

}
