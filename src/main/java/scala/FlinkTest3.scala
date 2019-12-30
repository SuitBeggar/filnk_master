package scala

import org.apache.flink.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

/**
 * Created by fangyitao on 2019/12/18.
 */
object FlinkTest3 {

  def main(args: Array[String]): Unit = {

      val  env = StreamExecutionEnvironment.getExecutionEnvironment

      val list : List[Int] = List(1,2,3,4)

      val stream = env.fromCollection(List(1,2,3,4))
  }
}
