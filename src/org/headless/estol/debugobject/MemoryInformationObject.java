package org.headless.estol.debugobject;

import java.io.Serializable;

/**
 * TODO: fill this in HIGHPRIO
 * 
 * @author estol
 */
public class MemoryInformationObject implements Serializable
{
    private static final long serialVersionUID = 17356268479000L;
    
    private String total, free, max, used, peak;
    
    public MemoryInformationObject(String total, String free, String max, String used, String peak)
    {
        this.total = total;
        this.free  = free;
        this.max   = max;
        this.used  = used;
        this.peak  = peak;
    }
    
    
    public String getTotal()
    {
        return total;
    }
    
    public String getFree()
    {
        return free;
    }
    
    public String getMax()
    {
        return max;
    }
    
    public String getUsed()
    {
        return used;
    }
    
    public String getPeak()
    {
        return peak;
    }
}
