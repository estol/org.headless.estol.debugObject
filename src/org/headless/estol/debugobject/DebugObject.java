package org.headless.estol.debugobject;

import java.io.Serializable;

/**
 * @author estol
 */
public class DebugObject implements Serializable
{
    private static final long serialVersionUID = 17356268479L;
    
    private MemoryInformationObject mio;
    private ThreadInformationObject tio;
    private DebugInformationObject  dio;
    
    public DebugObject() {}
    
    public DebugObject(MemoryInformationObject mio, ThreadInformationObject tio, DebugInformationObject dio)
    {
        this.mio = mio;
        this.tio = tio;
        this.dio = dio;
    }
    
    public void setMemoryInformationObject(MemoryInformationObject mio)
    {
        this.mio = mio;
    }
    
    public void setThreadInformationObject(ThreadInformationObject tio)
    {
        this.tio = tio;
    }
    
    public void setDebugInformationObject (DebugInformationObject dio)
    {
        this.dio = dio;
    }
    
    public MemoryInformationObject getMemoryInformationObject()
    {
        return mio;
    }
    
    public ThreadInformationObject getThreadInformationObject()
    {
        return tio;
    }
    
    public DebugInformationObject getDebugInformationObject()
    {
        return dio;
    }
    
    @Override
    public String toString()
    {
        return "";
    }
}
