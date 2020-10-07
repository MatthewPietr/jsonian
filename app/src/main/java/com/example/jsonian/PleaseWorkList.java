package com.example.jsonian;

import com.google.gson.annotations.SerializedName;

public class PleaseWorkList {
    @SerializedName("name")
    public String company;
    @SerializedName("year")
    public int founded;
    @SerializedName("product")
    public String produces;

    public String getCompany()  {return company;}

    public int getYear()    {return founded;}

    public String getProduct()  {return produces;}

    public PleaseWorkList(String name, int year, String product){
        company = name;
        founded = year;
        produces = product;
    }


}
