package org.dhis2.mobile.io.models.eidsr;

import java.util.ArrayList;

/**
 * Created by george on 9/23/16.
 */

public class Disease {
    private String label;
    private String id;
    private Boolean isCritical;
    private ArrayList<String> disabledFields;
    private Boolean isAdditional;

    public Disease(String label, String id, Boolean isCritical, Boolean isAdditional, ArrayList<String> disabledFields){
        this.label = label;
        this.id = id;
        this.isCritical = isCritical;
        this.disabledFields = disabledFields;
        this.isAdditional = isAdditional;
    }

    public String getLabel(){
        return this.label;
    }
    public String getId(){
        return this.id;
    }
    public Boolean isCritical(){
        return this.isCritical;
    }
    public ArrayList<String> getDisabledFields(){
        return this.disabledFields;
    }
    public Boolean isAdditionalDisease(){
        return isAdditional;
    }

}
