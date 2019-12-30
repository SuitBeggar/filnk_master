package scala

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.api.scala._

/**
 * Created by fangyitao on 2019/12/18.
 */
object FlinkTest4 {

  def main(args: Array[String]): Unit = {

    val  env = StreamExecutionEnvironment.getExecutionEnvironment

    val stream1 = env.generateSequence(1,10)

    val stream1Map = stream1.map( x => x * 2)

    val stream2 = env.readTextFile("hdfs://master:9000/The_Man_of_Property.txt")


  }

}
