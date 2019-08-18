
package com.namezio.demonetworking.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("propellant")
    @Expose
    public String propellant;
    @SerializedName("destination")
    @Expose
    public String destination;
    @SerializedName("imageurl")
    @Expose
    public String imageurl;
    @SerializedName("technologyexists")
    @Expose
    public String technologyexists;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPropellant() {
        return propellant;
    }

    public void setPropellant(String propellant) {
        this.propellant = propellant;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTechnologyexists() {
        return technologyexists;
    }

    public void setTechnologyexists(String technologyexists) {
        this.technologyexists = technologyexists;
    }

    public Post withId(String id) {
        this.id = id;
        return this;
    }

    public Post withName(String name) {
        this.name = name;
        return this;
    }

    public Post withPropellant(String propellant) {
        this.propellant = propellant;
        return this;
    }

    public Post withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public Post withImageurl(String imageurl) {
        this.imageurl = imageurl;
        return this;
    }

    public Post withTechnologyexists(String technologyexists) {
        this.technologyexists = technologyexists;
        return this;
    }

}
