/*
 * Copyright (C) 2015 banjum
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ghc.foss.ds;

import java.util.ArrayList;

/**
 *
 * @author banjum
 */
public class List implements DataStructure{
    
    //Implementinig List operations using ArrayList Container
    ArrayList<Integer> list;
    
    public List()
    {
        
    }
    public void addRandomValues()
    {
        
    }
    
    public void add (Integer element)
    {
        
    }
    
    public Boolean remove(Integer element)
    {
        return list.remove(element);
    }
    
    public void removeAll()
    {
        list.removeAll(list);
    }
    
    public Integer size()
    {
        return list.size();
    }
    
     /**
     * Get DISPLAY string, to visualize the List 
     * @param columns the number of columns in the final display area (TextArea)
     * @return a formatted string to display the current state of the List
     */
    @Override
    public String getDisplayString(int columns)
    {
        String displayString=addHeadPointer(columns);
        
        if(size()==0)
            displayString+=Utility.addSpaces(9);
        else
            displayString+=Utility.addSpaces(5);
        
        for(int i = 0;i<size();i++)
        {
            displayString+=list.get(i);
            displayString+=Utility.addSpaces(3);
        }
        
        return displayString;
    }
    
    /***************************
    //PRIVITE UTILITY FUNCTIONS
    ***************************/
    
    //Create a string with appropriate spaces and a representation
    //of a TOP arrow, pointing to the top of the Stack
    private String addHeadPointer(int x)
    {
        String head = "\n   HEAD\n     |\n     |\n     *\n";
        return head;
    }
        
    
}
