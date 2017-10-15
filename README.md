First  EJB program
1)Crete EJB project then create session bean and create any method provide business logic
  Used annotation-
@Stateless
@LocalBean
2)Create dynamic web project  and make servlet call the business method inside the doGet method of servlet.
Using annotation @EJB inject the session bean object  

3)Create enterprise Application select both above project 

4)run the application using Application server like JBoss

Note-
If u are getting following error
 JBREM000200: Remote connection failed: java.io.IOException: Received an invalid message length of 1347375956
Then u have to change the following port
Changing the ports :
•	management-http from 9990 to 8990
•	management-https from 9443 to 8443
•	management-native from 9999 to 8999


jboss-as-7.1.0.Final\standalone\configuration\standalone.xml

<socket-binding name="management-native" interface="management" port="${jboss.management.native.port:8999}"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:8990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:8443}"/>


	
