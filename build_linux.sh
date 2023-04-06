 jar cvf framework.jar -C Framework/build/web/WEB-INF/classes/ etu2053

 mv framework.jar test/build/web/WEB-INF/lib/

 jar cvf test.war -C test/build/web .

 mv test.war media/mickael/70A449C1A4498B14/Logiciel Linux/apache-tomcat-9.0.71/webapps
