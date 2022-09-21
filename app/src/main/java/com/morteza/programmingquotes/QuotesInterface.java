package com.morteza.programmingquotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuotesInterface {


    @GET("quotes")
    Call<List<ProgrammingQuote>> getQuotes();

}
