package com.example.smemanucollection;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName ="Particulars")
public class SME {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Product_Name")
    public String productName;

    @ColumnInfo(name = "Product_Landing")
    public int productLanding;
    @ColumnInfo(name = "Product_Mrp")
    public int productMrp;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    Byte[] image;

    public Byte[] getImage() {
        return image;
    }

    public int getProductLanding() {
        return productLanding;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductMrp() {
        return productMrp;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductLanding(int productLanding) {
        this.productLanding = productLanding;
    }

    public void setProductMrp(int productMrp) {
        this.productMrp = productMrp;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
