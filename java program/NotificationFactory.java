public class NotificationFactory{
   public Notification createNotification (String notofication){
   if (notificationName is null && ! notofication.isEmpty()){
   Switch (notificationName){
      case "Facebook":
      return new Facebook();
	  
	  case "Instagram":
      return new Instagram();
	  
	  case "Whatsapp":
      return new Whatsapp();
	  
	  default:
	  throu new IllegalStateExcaption();
	  }
	 }
	  return null;
}
}
package com,factory.service.notification.manager:
import com.factory.service.notification.Notification:

public class NotificationManager{
  
  public static void main (String [] args){
  
  notificationFactory notification = new NotificationFactory();
  Notification notification = notificationFactory.createNotification ("Facebook");
  
  Notification.showNotification();