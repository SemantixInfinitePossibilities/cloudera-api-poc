import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext

/**
  * Created by soray on 25/04/2018.
  */
object SparkHive {

  def main(args: Array[String]): Unit = {

    val ctx = new SparkContext(new SparkConf()
      .setAppName("Santander")
//      .setMaster("local[*]")
    )

    val hiveContext = new HiveContext(ctx)
    hiveContext.setConf("spark.sql.hive.convertMetastoreOrc", "false")
    hiveContext.setConf("spark.sql.caseSensitive", "false")
    hiveContext.setConf("hive.exec.dynamic.partition", "true")
    hiveContext.setConf("hive.exec.dynamic.partition.mode", "nonstrict")

    args.foreach(x => hiveContext.sql(x).show(50))
  }

}
