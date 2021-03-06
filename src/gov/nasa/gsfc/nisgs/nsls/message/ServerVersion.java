/*
Copyright (c) 1999-2007, United States Government, as represented by
the Administrator for The National Aeronautics and Space Administration.
All rights reserved.
*/
/******************************************************************************
*
*  NISGS/NSLS
*
*  History:
*
*  28-Sep-05, 	Original version.
*
******************************************************************************/

package gov.nasa.gsfc.nisgs.nsls.message;
import java.io.*;

public class ServerVersion implements Serializable {
  private String version;
  public ServerVersion (String version) {
    this.version = version;
  }
  public String getVersion () {
    return version;
  }
  private static final long serialVersionUID = 1L;
}
