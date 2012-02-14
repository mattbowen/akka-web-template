Akka Web Template
=================
This is a sbt-based, scala Akka project that sets up a web project with REST and comet support. It includes a simple hello-world style demo application and an actor boot class. It is inspired by efleming969's [akka-template-rest][]. However, it differs in that it

* uses sbt dependencies instead of setting up maven repositories
* uses sbt 0.11 and the xsbt-web-plugin
* targets Akka 1.3.1 and Scala 2.9.1

This template is released under Apache 2 License.

Usage
-----

1. Make sure you have sbt installed and in your path. If not, see https://github.com/harrah/xsbt/wiki
2. cd akka-web-template
3. sbt (which will bring you to an sbt prompt)
4. update
5. compile
6. container:start
7. In a browser, visit http://localhost:8080/
8. container:stop (to stop the servlet container)

Places to make changes
----------------------

You'll probably want to make changes in the following files:

* build.sbt (this is where you'll set your project name, your name, the scala version, and so forth)
* project/plugins.sbt (this is where you'll set the xsbt-web-plugin version)
* src/main/resources/akka.conf (this is where all of the Akka-specific settings are. If you change the package names [recommended], you'll need to at least change the boot class name)
* src/main/webapp/WEB-INF/web.xml (this is where jetty (or whatever container you're using) gets configured; even money, you'll want to add some other servlets and change the url-pattern mapping for the AkkaServlet)
* src/main/scala/AkkaWebTemplate.scala (this is a simple hello-world style example. Expect to replace it entirely)
* src/main/scala/Boot.scala (this is the boot class for Akka; you'll probably want to change the package name, remove my demo actor, and start adding your own)

Notes
-----

* The Akka version is hard-coded to 1.3.1. If you want to change that, you'll need to change build.sbt and src/main/resources/akka.conf

Changelog
---------
2012-02-14

* Updated to sbt 0.11, akka 1.3.1, scala 2.9.1 [cspellmann]

2010-10-14

* Closed #1 and #2 [MattBowen]

2010-07-31

* initial commit [MattBowen]

[akka-template-rest]: http://github.com/efleming969/akka-template-rest "akka-template-rest"
