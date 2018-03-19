package com.huanuo.npo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "cfg_siteinfo")
public class SiteInfo {
    String	city ;
    String	sitelocation	;
    int 	enbid	;
    long	ci	;
    String	cellname_c	;
    int	sector	;
    int	pci	;
    String	vendor	;
    String	site_important	;
    String	celltype	;
    double	lon	;
    double	lat	;
    int	reference_signal	;
    int	bandinfo	;
    double	earfcn	;
    String	band	;
    double	downtilt_e	;
    double	downtilt_m	;
    double	azimuth	;
    double	height	;
    int	neighbor_lte	;
    int	neighbor_td	;
    int	neighbor_gsm	;


    public SiteInfo(){

    }

    public SiteInfo(String city, String sitelocation, int enbid, long ci, String cellname_c, int sector, int pci, String vendor, String site_important, String celltype, double lon, double lat, int reference_signal, int bandinfo, double earfcn, String band, double downtilt_e, double downtilt_m, double azimuth, double height, int neighbor_lte, int neighbor_td, int neighbor_gsm) {
        this.city = city;
        this.sitelocation = sitelocation;
        this.enbid = enbid;
        this.ci = ci;
        this.cellname_c = cellname_c;
        this.sector = sector;
        this.pci = pci;
        this.vendor = vendor;
        this.site_important = site_important;
        this.celltype = celltype;
        this.lon = lon;
        this.lat = lat;
        this.reference_signal = reference_signal;
        this.bandinfo = bandinfo;
        this.earfcn = earfcn;
        this.band = band;
        this.downtilt_e = downtilt_e;
        this.downtilt_m = downtilt_m;
        this.azimuth = azimuth;
        this.height = height;
        this.neighbor_lte = neighbor_lte;
        this.neighbor_td = neighbor_td;
        this.neighbor_gsm = neighbor_gsm;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSitelocation() {
        return sitelocation;
    }

    public void setSitelocation(String sitelocation) {
        this.sitelocation = sitelocation;
    }

    public int getEnbid() {
        return enbid;
    }

    public void setEnbid(int enbid) {
        this.enbid = enbid;
    }
   @Id
    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getCellname_c() {
        return cellname_c;
    }

    public void setCellname_c(String cellname_c) {
        this.cellname_c = cellname_c;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public int getPci() {
        return pci;
    }

    public void setPci(int pci) {
        this.pci = pci;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSite_important() {
        return site_important;
    }

    public void setSite_important(String site_important) {
        this.site_important = site_important;
    }

    public String getCelltype() {
        return celltype;
    }

    public void setCelltype(String celltype) {
        this.celltype = celltype;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getReference_signal() {
        return reference_signal;
    }

    public void setReference_signal(int reference_signal) {
        this.reference_signal = reference_signal;
    }

    public int getBandinfo() {
        return bandinfo;
    }

    public void setBandinfo(int bandinfo) {
        this.bandinfo = bandinfo;
    }

    public double getEarfcn() {
        return earfcn;
    }

    public void setEarfcn(double earfcn) {
        this.earfcn = earfcn;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getDowntilt_e() {
        return downtilt_e;
    }

    public void setDowntilt_e(double downtilt_e) {
        this.downtilt_e = downtilt_e;
    }

    public double getDowntilt_m() {
        return downtilt_m;
    }

    public void setDowntilt_m(double downtilt_m) {
        this.downtilt_m = downtilt_m;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this.azimuth = azimuth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNeighbor_lte() {
        return neighbor_lte;
    }

    public void setNeighbor_lte(int neighbor_lte) {
        this.neighbor_lte = neighbor_lte;
    }

    public int getNeighbor_td() {
        return neighbor_td;
    }

    public void setNeighbor_td(int neighbor_td) {
        this.neighbor_td = neighbor_td;
    }

    public int getNeighbor_gsm() {
        return neighbor_gsm;
    }

    public void setNeighbor_gsm(int neighbor_gsm) {
        this.neighbor_gsm = neighbor_gsm;
    }

    @Override
    public String toString() {
        return "SiteInfo{" +
                "city='" + city + '\'' +
                ", sitelocation='" + sitelocation + '\'' +
                ", enbid=" + enbid +
                ", ci=" + ci +
                ", cellname_c='" + cellname_c + '\'' +
                ", sector=" + sector +
                ", pci=" + pci +
                ", vendor='" + vendor + '\'' +
                ", site_important='" + site_important + '\'' +
                ", celltype='" + celltype + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                ", reference_signal=" + reference_signal +
                ", bandinfo=" + bandinfo +
                ", earfcn=" + earfcn +
                ", band='" + band + '\'' +
                ", downtilt_e=" + downtilt_e +
                ", downtilt_m=" + downtilt_m +
                ", azimuth=" + azimuth +
                ", height=" + height +
                ", neighbor_lte=" + neighbor_lte +
                ", neighbor_td=" + neighbor_td +
                ", neighbor_gsm=" + neighbor_gsm +
                '}';
    }
}
