package com.cisco.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConferenceBean {
    public String name = "conf";
    public String id = "id1";

    public ConferenceBean() {}

    public ConferenceBean(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
