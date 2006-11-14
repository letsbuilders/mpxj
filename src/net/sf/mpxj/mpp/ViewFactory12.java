/*
 * file:       ViewFactory12.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2005
 * date:       27 September 2006
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.mpp;

import java.io.IOException;
import java.util.Map;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.View;
import net.sf.mpxj.ViewType;


/**
 * Default implementation of a view factory for MPP12 files.
 */
class ViewFactory12 implements ViewFactory
{
   /**
    * {@inheritDoc}
    */
   public View createView (ProjectFile file, byte[] fixedMeta, byte[] fixedData, Var2Data varData, Map fontBases)
      throws IOException
   {
      View view;
      int type  = MPPUtility.getShort(fixedData, 110);
      if (type == 1)
      {
         view = new SplitView9 (fixedData, varData);
      }
      else
      {
         type = MPPUtility.getShort(fixedData, 112);
         switch (type)
         {
            case ViewType.GANTT_CHART_VALUE:
            {
               view = new GanttChartView12 (file, fixedMeta, fixedData, varData, fontBases);               
               break;
            }
   
            default:
            {
               view = new GenericView (fixedData);            
               break;
            }
         }
      }
            
      return (view);
   }
}