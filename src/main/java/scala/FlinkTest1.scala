package scala

import org.apache.flink.streaming.api.datastream.DataStream
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment


/**
 * Created by fangyitao on 2019/12/18.
 */
object FlinkTest1 {
  def main(args: Array[String]): Unit = {

      val env = StreamExecutionEnvironment.getExecutionEnvironment

      val stream = env.readTextFile("hdfs://master:9000/u1.test")

      stream.print()

      env.execute("FlinkTest1")
  }
}
