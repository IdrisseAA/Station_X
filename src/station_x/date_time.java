package station_x;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class date_time extends Thread
		             {
date_time ()
{ 
    start();
}

 public void run(){
  for (;;)
	 {
      Date date1 = new Date();
      DateFormat formatdate = new SimpleDateFormat("EEEE, d MMMMM  yyyy");
      DateFormat formatdate2 = new SimpleDateFormat("HH:mm:ss"); 
      Fenetre_du_Station_X.Label_date_heure.setText(" "+formatdate.format(date1)+"   "+formatdate2.format(date1));
     

          }

                   }
		               }

