 RESTfulExample
 
 1. git clone https://github.com/douglas-man/RESTfulExample.git
 2. mvn jetty:run
 3. http://localhost:8080/rest/webapi/hello/accenture  ..(see plugin configuration...)
 4. for gradle jettyRun
 5. http://localhost:8080/RESTfulExample/webapi/hello/accenture

For using jdb, 

   mvn jetty:run-forked jetty:run


            <plugin>
                <groupId>org.eclipse.jetty</groupId>
                <artifactId>jetty-maven-plugin</artifactId>
                <version>9.3.8.v20160314</version>
                <configuration>
                    <webApp><contextPath>/rest</contextPath></webApp>
                    <jvmArgs>-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=1044</jvmArgs>
                    <stopKey>CTRL+C</stopKey>
                    <stopPort>8999</stopPort>
                    <scanIntervalSeconds>10</scanIntervalSeconds>
                    <webAppSourceDirectory>${basedir}/src/main/webapp/</webAppSourceDirectory>
                    <webAppConfig>
                        <descriptor>${basedir}/src/main/webapp/WEB-INF/web.xml</descriptor>
                    </webAppConfig>
                    <connectors>
                        <connector implementation="org.eclipse.jetty.server.nio.SelectChannelConnector">
                            <port>8080</port>
                            <responseHeaderSize>16192</responseHeaderSize>
                        </connector>
                    </connectors>                    
                </configuration>
                <executions>
                    <execution>
                        <phase>test</phase>
                        <goals>
                            <goal>run-exploded</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>


