# Jetty
Eclipse Jetty provides a Web server and javax.servlet container, plus support for HTTP/2, WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. 

# Environment
Jetty version: 8.1.8.v20121106

Eclipse version: Luna Service Release 2 (4.4.2)

OS platform: win7

Java version: Java1.8

# Directory Structure

~~~~
\---Jetty-HTTP-example
    |   a.png
    |   b.png
    |   c.png
    |   README.md
    |
    +---bin
    |   \---com
    |       \---example
    |           \---server
    |                   ApiDemo.class
    |                   ServerMain.class
    |                   Tool.class
    |
    +---lib
    |       jetty-all-8.1.8.v20121106.jar
    |       servlet-api-3.0.jar
    |
    +---src
    |   \---com
    |       \---example
    |           \---server
    |                   ApiDemo.java
    |                   ServerMain.java
    |                   Tool.java
    |
    \---web
        |   index.html
        |
        \---WEB-INF
                web.xml
~~~~


# Demonstration
![server started](a.png)
![server started](b.png)
![server started](c.png)
