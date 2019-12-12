package com.rental.project.dtos;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class AutoRegistration {

    @NotEmpty
    @NotNull
    private String marka;

    @NotEmpty
    @NotNull
    private String model;

    @NotNull
//    @Enumerated(EnumType.STRING)
    private String typ_nadwozia;

    @NotEmpty
    @NotNull
    private String rocznik;

    @NotEmpty
    @NotNull
    private String kolor;

    @NotEmpty
    @NotNull
    private String przebieg;

    @NotNull
//    @Enumerated(EnumType.STRING)
    private String status;

    @NotEmpty
    @NotNull
    private String kwota;

    public AutoRegistration() {
        this.marka = marka;
        this.model = model;
        this.typ_nadwozia = typ_nadwozia;
        this.rocznik = rocznik;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.status = status;
        this.kwota = kwota;
    }

    public static MultipartFile[] getFiles() {
        return new MultipartFile[0];
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTyp_nadwozia() {
        return typ_nadwozia;
    }

    public void setTyp_nadwozia(String typ_nadwozia) {
        this.typ_nadwozia = typ_nadwozia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRocznik() {
        return rocznik;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(String przebieg) {
        this.przebieg = przebieg;
    }


    public String getKwota() {
        return kwota;
    }

    public void setKwota(String kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "AutoRegistration{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", typ_nadwozia=" + typ_nadwozia +
                ", rocznik='" + rocznik + '\'' +
                ", kolor='" + kolor + '\'' +
                ", przebieg='" + przebieg + '\'' +
                ", status=" + status +
                ", kwota='" + kwota + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoRegistration that = (AutoRegistration) o;
        return Objects.equals(marka, that.marka) &&
                Objects.equals(model, that.model) &&
                typ_nadwozia == that.typ_nadwozia &&
                Objects.equals(rocznik, that.rocznik) &&
                Objects.equals(kolor, that.kolor) &&
                Objects.equals(przebieg, that.przebieg) &&
                status == that.status &&
                Objects.equals(kwota, that.kwota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, typ_nadwozia, rocznik, kolor, przebieg, status, kwota);
    }
}
