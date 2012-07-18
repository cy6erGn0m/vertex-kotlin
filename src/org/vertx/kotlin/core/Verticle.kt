package org.vertx.kotlin.core

import org.vertx.java.deploy.Verticle
import org.vertx.java.core.http.HttpServer
import org.vertx.java.core.Vertx
import org.vertx.java.core.http.HttpClient
import org.vertx.java.core.net.NetServer
import org.vertx.java.core.net.NetClient
import org.vertx.java.core.eventbus.EventBus
import org.vertx.java.core.logging.Logger

public fun Verticle.createHttpServer(config: HttpServer.()->Unit) : HttpServer = getVertx().createHttpServer(config)

public fun Verticle.createHttpClient(config: HttpClient.()->Unit) : HttpClient = getVertx().createHttpClient(config)

public fun Verticle.createNetServer(config: NetServer.()->Unit) : NetServer = getVertx().createNetServer(config)

public fun Verticle.createNetClient(config: NetClient.()->Unit) : NetClient = getVertx().createNetClient(config)

public fun Verticle.setPeriodic(l: Long, longHandler: (Long)->Unit) : Long = getVertx().setPeriodic(l, longHandler)

public val Verticle.eventBus: EventBus
    get() = getVertx()!!.eventBus()!!

public fun Verticle.runOnLoop(handler: ()->Any?) : Unit = getVertx().runOnLoop(handler);

public val Verticle.logger: Logger
    get() = getContainer()!!.getLogger()!!