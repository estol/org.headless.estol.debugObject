
package org.headless.estol.debugobject;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author estol
 */
public class DebugInformationObject implements Serializable
{
    private static final long serialVersionUID = 17356268479002L;
    
    private Map<String, String> debugMessages;
    
    public DebugInformationObject(Map<String, String> messages)
    {
        debugMessages = messages;
    }
    
    public Map<String, String> getDebugMessages()
    {
        return debugMessages;
    }
    
    public String[] getKeys()
    {
        return (String[]) debugMessages.keySet().toArray();
    }
    
    public String[] getValues()
    {
        return (String[]) debugMessages.values().toArray();
    }
}
