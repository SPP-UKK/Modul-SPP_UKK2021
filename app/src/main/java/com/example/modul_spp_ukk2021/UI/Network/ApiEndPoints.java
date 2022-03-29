package com.example.modul_spp_ukk2021.UI.Network;



import com.example.modul_spp_ukk2021.UI.Data.Repository.LoginSiswaRepository;
import com.example.modul_spp_ukk2021.UI.Data.Repository.LoginStafRepository;
import com.example.modul_spp_ukk2021.UI.Data.Repository.PembayaranRepository;
import com.example.modul_spp_ukk2021.UI.Data.Repository.PetugasRepository;
import com.example.modul_spp_ukk2021.UI.Data.Repository.SiswaRepository;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoints {

    @GET("dbReadSiswa.php")
    Call<SiswaRepository> viewSiswa();
    @GET("dbReadPetugas.php")
    Call<PetugasRepository> viewPetugas();
    @FormUrlEncoded
    @POST("dbLoginSiswa.php")
    Call<LoginSiswaRepository> loginSiswa(
            @Field("nisn") String nisn,
            @Field("password") String password);
    @FormUrlEncoded
    @POST("dbLoginStaffLevel.php")
    Call<LoginStafRepository> loginStaf(
            @Field("username") String username,
            @Field("password") String password);
    @FormUrlEncoded
    @POST("dbReadTagihan.php")
    retrofit2.Call<PembayaranRepository> viewTagihan(
            @Field("nisn") String nisn);

    @FormUrlEncoded
    @POST("dbReadHistory.php")
    retrofit2.Call<PembayaranRepository> viewHistory(
            @Field("nisn") String nisn);

    @FormUrlEncoded
    @POST("dbReadPetugas.php")
    Call<PetugasRepository> viewDataPetugas(
            @Field("username") String username);
    @GET("dbReadSiswa.php")
    Call<SiswaRepository> viewDataSiswa();

    Call<PetugasRepository> viewDataPetugas();
}
