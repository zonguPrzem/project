package com.rental.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Auto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAuta;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String marka;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String model;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypNadwozia typ_nadwozia;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String rocznik;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String kolor;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String przebieg;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AutoStatus status;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String kwota;

    @ElementCollection
    @CollectionTable(name = "auto_images")
    private static Set<Image> images = new HashSet<>();

    public Auto() {
        this.marka = marka;
        this.model = model;
        this.typ_nadwozia = typ_nadwozia;
        this.rocznik = rocznik;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.status = status;
        this.kwota = kwota;
    }

    public static void setModel(User loggedInUser) {

    }

    public void setImages(Set<Image> images) {
        Auto.images = images;
    }

    public static void addImage(Image image){
        images.add(image);
    }
    public long getIdAuta() {
        return idAuta;
    }

    public void setIdAuta(long idAuta) {
        this.idAuta = idAuta;
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

    public TypNadwozia getTyp_nadwozia() {
        return typ_nadwozia;
    }

    public void setTyp_nadwozia(TypNadwozia typ_nadwozia) {
        this.typ_nadwozia = typ_nadwozia;
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

    public AutoStatus getStatus() {
        return status;
    }

    public void setStatus(AutoStatus status) {
        this.status = status;
    }

    public String getKwota() {
        return kwota;
    }

    public void setKwota(String kwota) {
        this.kwota = kwota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return idAuta == auto.idAuta &&
                Objects.equals(marka, auto.marka) &&
                Objects.equals(model, auto.model) &&
                typ_nadwozia == auto.typ_nadwozia &&
                Objects.equals(rocznik, auto.rocznik) &&
                Objects.equals(kolor, auto.kolor) &&
                Objects.equals(przebieg, auto.przebieg) &&
                status == auto.status &&
                Objects.equals(kwota, auto.kwota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAuta, marka, model, typ_nadwozia, rocznik, kolor, przebieg, status, kwota);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "idAuta=" + idAuta +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", typ_nadwozia=" + typ_nadwozia +
                ", rocznik='" + rocznik + '\'' +
                ", kolor='" + kolor + '\'' +
                ", przebieg='" + przebieg + '\'' +
                ", status=" + status +
                ", kwota='" + kwota + '\'' +
                '}';
    }

    public long getId() {
        return idAuta;
    }
}
