package net.dirtcraft.dirtrestrict.Configuration.DataTypes;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@ConfigSerializable
public class Restriction {
    @Setting private boolean hidden;
    @Setting private String reason;
    @Setting private List<RestrictionType> restrictions;

    public Restriction(){
        this.hidden = false;
        this.reason = "";
        this.restrictions = new ArrayList<>(Arrays.asList(RestrictionTypes.getTypes()));
    }

    public Restriction(String reason){
        this.hidden = false;
        this.reason = reason;
        this.restrictions = new ArrayList<>(Arrays.asList(RestrictionTypes.getTypes()));
    }

    public String getReason() {
        return reason;
    }

    public boolean isRestricted(RestrictionType type) {
        return restrictions.contains(type);
    }

    public void setRestrictions(RestrictionTypes type, boolean value) {
        if (value) this.restrictions.add(type);
        else this.restrictions.remove(type);
    }

    public void toggleRestrictions(RestrictionTypes type){
        setRestrictions(type, !isRestricted(type));
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
