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
 *
 * @author Péter Szabó
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
