/*
 * Copyright (C) 2014 Péter Szabó
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.headless.estol.debugobject;

import java.io.Serializable;

/**
 * @author Péter Szabó
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
