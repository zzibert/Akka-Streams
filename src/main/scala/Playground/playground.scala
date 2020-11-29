package Playground

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.{Sink, Source}

object playground extends App{

  implicit val actorSystem = ActorSystem("Playground")
  implicit val materializer = ActorMaterializer()

  Source.single("Hello Streams").to(Sink.foreach(println)).run()
}
