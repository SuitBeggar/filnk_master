package scala

import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment


/**
 * Created by fangyitao on 2019/12/18.
 */
object FlinkTest2 {

  def main(args: Array[String]): Unit = {

      val  env = StreamExecutionEnvironment.getExecutionEnvironment

      val  stream = env.socketTextStream("master",9999)

      stream.print()

      env.execute("FlinkTest2");


  }

}
