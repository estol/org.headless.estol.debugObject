package org.headless.estol.debugobject;

import java.io.Serializable;

/**
 *
 * @author estol
 */
public class ThreadInformationObject implements Serializable
{
    private static final long serialVersionUID = 17356268479001L;
    
    private int currentTC, peakTC, resetTC;
    
    public ThreadInformationObject(int currentTC, int peakTC, int resetTC)
    {
        this.currentTC = currentTC;
        this.peakTC    = peakTC;
        this.resetTC   = resetTC;
    }
    
    public int getCurrentTC()
    {
        return currentTC;
    }
    
    public int getPeakTC()
    {
        return peakTC;
    }
    
    public int getResetTC()
    {
        return resetTC;
    }
}
